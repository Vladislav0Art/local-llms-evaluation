package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class GeneratedAppendKeyValEmptyKeyTest {

    private static class MockKeyVal implements Connection.KeyVal {
        String key;
        String value;

        MockKeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String key() {
            return key;
        }

        @Override
        public Connection.KeyVal key(String key) {
            this.key = key;
            return this;
        }

        @Override
        public String value() {
            return value;
        }

        @Override
        public Connection.KeyVal value(String value) {
            this.value = value;
            return this;
        }
    }

    @Test
    public void appendKeyValEmptyKeyTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = new MockKeyVal("", "value");
        urlBuilder.appendKeyVal(kv);

        assertThat(urlBuilder.build().getQuery(), is("=value"));
    }

}