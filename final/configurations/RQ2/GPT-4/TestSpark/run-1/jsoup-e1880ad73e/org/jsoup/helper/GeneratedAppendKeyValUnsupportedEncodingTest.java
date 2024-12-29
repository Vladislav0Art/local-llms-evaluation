package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValUnsupportedEncodingTest {

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

        public String toString() {
            return key + "=" + val;
        }

        public String contentType() {
            return null;
        }
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL inputUrl = null;
        try {
            inputUrl = new URL("http://example.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Connection.KeyVal kv = new TestKeyVal("testKey", "testVal2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
    }

}