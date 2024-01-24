package com.java.talent.platform.vm.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author kscs
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {


    @Bean
    public RequestLogFilter requestLogFilter() {
        return new RequestLogFilter();
    }


    @Bean
    public FilterRegistrationBean<RequestLogFilter> requestLogFilterBean() {
        FilterRegistrationBean<RequestLogFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(requestLogFilter());
        bean.setName("requestLogFilter");
        // 这里不考虑spring boot应用提供静态资源访问功能
        bean.addUrlPatterns("/*");
        bean.setOrder(1);
        return bean;
    }
}
