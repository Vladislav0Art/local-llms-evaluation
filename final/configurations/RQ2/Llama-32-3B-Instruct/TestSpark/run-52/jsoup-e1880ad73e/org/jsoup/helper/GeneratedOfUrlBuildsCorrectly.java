package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.net.URL;

import org.jsoup.Connection.KeyVal;
import org.mockito.Mockito;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.DataUtil;

public class GeneratedOfUrlBuildsCorrectly {

    @Test
    public void ofUrlBuildsCorrectly() {
        URL url = new URL("https://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        URL builtUrl = builder.build();
        assertEquals("https://example.com", builtUrl.toString());
    }

    public static class UrlBuilderImpl implements UrlBuilder {

        private String url;

        public UrlBuilderImpl(String url) {
            this.url = url;
        }

        @Override
        public URL build() {
            return new URL(url);
        }

        @Override
        public void appendKeyVal(KeyVal kv) {
            // implementation details omitted
        }
    }

    public static class KeyValImpl implements KeyVal {

        private String key;
        private String value;

        @Override
        public void setKey(String key) {
            this.key = key;
        }

        @Override
        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    public static class StringUtilImpl implements StringUtil {

        // no methods needed
    }

    public void appendKeyValEncodesKeyCorrectly() throws Exception {
        UrlBuilder builder = new UrlBuilderImpl();
        KeyVal kv = new KeyValImpl();
        Mockito.when(StringUtil.encodeString("test")).thenReturn("encoded_key");
        builder.appendKeyVal(kv);
        assertEquals("encoded_key", kv.getKey());
    }

    public void appendKeyValEncodesValueCorrectly() throws Exception {
        UrlBuilder builder = new UrlBuilderImpl();
        KeyVal kv = new KeyValImpl();
        Mockito.when(StringUtil.encodeString("test")).thenReturn("encoded_value");
        builder.appendKeyVal(kv);
        assertEquals("encoded_value", kv.getValue());
    }

}