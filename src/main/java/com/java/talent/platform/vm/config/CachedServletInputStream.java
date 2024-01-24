package com.java.talent.platform.vm.config;

import jakarta.servlet.ReadListener;
import jakarta.servlet.ServletInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import lombok.extern.slf4j.Slf4j;

/**
 * @author kscs
 */
@Slf4j
public class CachedServletInputStream extends ServletInputStream {

    private InputStream cachedInputStream;

    public CachedServletInputStream(byte[] cachedByteArray) {
        this.cachedInputStream = new ByteArrayInputStream(cachedByteArray);
    }

    @Override
    public boolean isFinished() {
        try {
            return cachedInputStream.available() == 0;
        } catch (IOException ex) {
            log.error(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean isReady() {
        return true;
    }

    @Override
    public void setReadListener(ReadListener readListener) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int read() throws IOException {
        return cachedInputStream.read();
    }
}

