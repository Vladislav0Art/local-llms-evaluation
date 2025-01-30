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

public class GeneratedBuildInvalidUrlTest {

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
    public void buildInvalidUrlTest() throws MalformedURLException {
        assertThrows(AssertionError.class, () -> new UrlBuilder(new URL("http:this:that")));
    }

}