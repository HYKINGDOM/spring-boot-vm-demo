package com.java.talent.platform.vm.config;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.talent.platform.vm.util.TraceIdUtil;
import jakarta.annotation.Resource;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * @author kscs
 */
@Slf4j
public class RequestLogFilter extends OncePerRequestFilter {

    @Resource
    private ObjectMapper objectMapper;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
        throws ServletException, IOException {
        TraceIdUtil.getTraceId();

        log.info("================================================================");
        log.info("========== {}: {}", request.getMethod(), request.getRequestURL());
        logParams(request);
        logPathParams(request);
        CachedHttpServletRequestWrapper requestWrapper = new CachedHttpServletRequestWrapper(request);
        logRequestBody(requestWrapper);

        filterChain.doFilter(requestWrapper, response);
    }

    private void logParams(HttpServletRequest request) {

        Map<String, String[]> parameterMap = request.getParameterMap();
        if (parameterMap != null && !parameterMap.isEmpty()) {
            log.info("========== params: {}", parameterMap);
        }
    }

    private void logPathParams(HttpServletRequest request) {

        String path = request.getRequestURI();
        String contextPath = request.getContextPath();
        String parameter = "";

        if (path.startsWith(contextPath)) {
            // 获取除去上下文路径后的路径
            parameter = path.substring(contextPath.length());
        }

        if (StrUtil.contains(parameter, "/")) {
            parameter = parameter.substring(parameter.lastIndexOf("/") + 1);
        }

        log.info("========== path params: {}", parameter);
    }

    @SneakyThrows
    private void logRequestBody(CachedHttpServletRequestWrapper request) {

        if (StrUtil.equals(request.getContentType(), MediaType.APPLICATION_JSON_VALUE)) {
            log.info("========== body: {}", objectMapper.readTree(request.getInputStream()));
        }

    }
}

