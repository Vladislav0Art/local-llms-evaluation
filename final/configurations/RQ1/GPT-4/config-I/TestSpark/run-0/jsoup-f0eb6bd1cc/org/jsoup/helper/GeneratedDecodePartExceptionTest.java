package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.Objects;

import static org.junit.Assert.*;

public class GeneratedDecodePartExceptionTest {

    @Test
    public void decodePartExceptionTest() throws Exception {
        URL url = new URL("http://[::1]");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    private Connection.KeyVal createMockKeyVal(String key, String value) {
        return new Connection.KeyVal() {
            @Override
            public String key() {
                return key;
            }

            @Override
            public String value() {
                return value;
            }

            @Override
            public Connection.KeyVal key(String s) {
                throw new UnsupportedOperationException("Not supported in this test.");
            }

            @Override
            public Connection.KeyVal value(String s) {
                throw new UnsupportedOperationException("Not supported in this test.");
            }

            @Override
            public String contentType() {
                throw new UnsupportedOperationException("Not supported in this test.");
            }
        };
    }

}