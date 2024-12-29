package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    private class TestKeyVal implements Connection.KeyVal {
        private String key;
        private String val;

        public TestKeyVal(String key, String val) {
            this.key = key;
            this.val = val;
        }

        public String key() {
            return key;
        }

        public Connection.KeyVal key(String key) {
            this.key = key;
            return this;
        }

        public String value() {
            return val;
        }

        public Connection.KeyVal value(String value) {
            this.val = value;
            return this;
        }

        public String contentType() {
            return "plain/text";
        }

        public Connection.KeyVal contentType(String contentType) {
            return this;
        }

        public String toString() {
            return key + "=" + val;
        }
    }

    @Test
    public void UrlBuilderConstructorTest() {
        URL inputUrl = null;
        try {
            inputUrl = new URL("http://example.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder);
    }

    @Test
    public void buildValidUrlTest() {
        URL inputUrl = null;
        try {
            inputUrl = new URL("http://example.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
    }

    @Test
    public void buildInvalidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

}