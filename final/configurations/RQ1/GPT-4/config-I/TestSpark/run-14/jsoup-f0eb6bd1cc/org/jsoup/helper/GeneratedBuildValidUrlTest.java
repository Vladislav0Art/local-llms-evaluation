package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedBuildValidUrlTest {

    private class MockKeyVal implements Connection.KeyVal {
        String key;
        String value;

        public MockKeyVal(String key, String value) {
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

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }

    @Test
    public void buildValidUrlTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        URL url = urlBuilder.build();
        assertEquals("http://example.com", url.toString());

        urlBuilder = new UrlBuilder(new URL("http://éxâmple.com"));
        url = urlBuilder.build();
        assertEquals("http://xn--xample-9ua.com", url.toString());
    }

}