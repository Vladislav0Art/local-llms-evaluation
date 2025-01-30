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

public class GeneratedAppendKeyValInvalidEncodingTest {

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
    public void appendKeyValInvalidEncodingTest() throws MalformedURLException {
        assertThrows(RuntimeException.class, () -> {
            Connection.KeyVal kv = new MockKeyVal("foo", new String(new byte[]{(byte) 0xC3, (byte) 0x28}, "UTF-8")); // invalid sequence
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
            urlBuilder.appendKeyVal(kv);
        });
    }

}