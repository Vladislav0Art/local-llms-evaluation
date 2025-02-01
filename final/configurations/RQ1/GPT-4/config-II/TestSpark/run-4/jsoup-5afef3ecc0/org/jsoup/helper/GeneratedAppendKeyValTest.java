package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException {
        String urlStr = "http://www.example.com";
        UrlBuilder builder = new UrlBuilder(new URL(urlStr));

        builder.appendKeyVal(new KeyValMock("param", "value"));
        URL url = builder.build();

        String expectedUrl = "http://www.example.com?param=value";
        assertEquals(expectedUrl, url.toString());
    }

    private static class KeyValMock implements Connection.KeyVal {
        private String key;
        private String value;

        public KeyValMock(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String key() {
            return key;
        }

        @Override
        public String value() {
            return value;
        }

        @Override
        public Connection.KeyVal key(String key) {
            this.key = key;
            return this;
        }

        @Override
        public Connection.KeyVal value(String value) {
            this.value = value;
            return this;
        }
    }

}