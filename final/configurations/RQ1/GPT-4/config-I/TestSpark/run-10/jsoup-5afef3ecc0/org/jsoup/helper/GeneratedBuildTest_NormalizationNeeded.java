package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;

public class GeneratedBuildTest_NormalizationNeeded {

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
    }

    @Test
    public void buildTest_NormalizationNeeded() throws MalformedURLException {
        URL url = new URL("http://www.domain.com/path?a=b");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();

        assertEquals("http", result.getProtocol());
        assertEquals("www.domain.com", result.getHost());
        assertEquals("/path", result.getPath());
        assertEquals("a=b", result.getQuery());
    }

}