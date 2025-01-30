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

public class GeneratedAppendKeyValTest {

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
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new MockKeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL url = urlBuilder.build();
        assertEquals("http://example.com?key=value", url.toString());

        kv = new MockKeyVal("简体中文", "日本語");
        urlBuilder.appendKeyVal(kv);
        url = urlBuilder.build();
        assertEquals("http://example.com?key=value&%E7%AE%80%E4%BD%93%E4%B8%AD%E6%96%87=%E6%97%A5%E6%9C%AC%E8%AA%9E", url.toString());
    }

}