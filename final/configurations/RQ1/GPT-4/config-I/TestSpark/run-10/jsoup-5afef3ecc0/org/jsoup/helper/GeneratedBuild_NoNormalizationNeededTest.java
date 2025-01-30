package org.jsoup.helper;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

public class GeneratedBuild_NoNormalizationNeededTest {

    private static class TestableKeyVal implements Connection.KeyVal {
        private String key;
        private String value;

        TestableKeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String key() {
            return key;
        }

        public Connection.KeyVal key(String key) {
            this.key = key;
            return this;
        }

        public String value() {
            return value;
        }

        public Connection.KeyVal value(String value) {
            this.value = value;
            return this;
        }

        public Connection.KeyVal contentType(String contentType) {
            return this;
        }

        public String contentType() {
            return null;
        }

        public Connection.KeyVal inputStream(java.io.InputStream inputStream) {
            return this;
        }

        public boolean hasInputStream() {
            return false;
        }
    }

    @Test
    public void build_NoNormalizationNeededTest() throws MalformedURLException {
        URL url = new URL("http://www.domain.com/path");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();

        assertEquals("http", result.getProtocol());
        assertEquals("www.domain.com", result.getHost());
        assertEquals("/path", result.getPath());
        assertNull(result.getQuery());
    }

}