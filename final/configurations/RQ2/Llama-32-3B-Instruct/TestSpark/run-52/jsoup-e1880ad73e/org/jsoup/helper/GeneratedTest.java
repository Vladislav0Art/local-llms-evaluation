package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.net.URL;

import org.jsoup.Connection.KeyVal;
import org.mockito.Mockito;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.DataUtil;

public class GeneratedTest {

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
        public String getKey() {
            return this.key;
        }

        @Override
        public String getValue() {
            return this.value;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class StringUtilImpl implements StringUtil {
        @Override
        public String encodeString(String input) {
            // implementation details omitted
            return input;
        }
    }

    @Test
    public void buildThrowsNullPointerExceptionWhenInputUrlIsNull() {
        assertNull(new UrlBuilder(null).build());
    }

}