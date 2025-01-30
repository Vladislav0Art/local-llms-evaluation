package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;

public class GeneratedBuildTest_MalformedUrl {

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
    public void buildTest_MalformedUrl() throws MalformedURLException {
        URL url = new URL("htp:/www.domain.com");
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

}