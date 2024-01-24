package com.java.talent.platform.vm.config;

import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import lombok.SneakyThrows;
import org.springframework.util.StreamUtils;

/**
 * @author kscs
 */
public class CachedHttpServletRequestWrapper extends HttpServletRequestWrapper {

    private byte[] cachedByteArray;

    @SneakyThrows
    public CachedHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
        InputStream in = request.getInputStream();
        this.cachedByteArray = StreamUtils.copyToByteArray(in);
    }

    @Override
    public ServletInputStream getInputStream() {
        return new CachedServletInputStream(this.cachedByteArray);
    }

    @Override
    public BufferedReader getReader() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.cachedByteArray);
        return new BufferedReader(new InputStreamReader(byteArrayInputStream));
    }
}

