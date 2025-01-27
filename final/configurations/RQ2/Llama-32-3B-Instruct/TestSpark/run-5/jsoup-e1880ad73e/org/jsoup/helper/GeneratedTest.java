package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testKeyVal() {
        KeyVal keyVal = new KeyVal("key", "value");
        StringUtil.KeyVal substr = new StringUtil.KeyVal(keyVal.key, keyVal.value);
        Assert.assertTrue(StringUtil.contains(substr.toString(), String.format("%s=%s", keyVal.key, keyVal.value)));
    }

    @Test
    public void testUrlDecoded() throws Exception {
        String url = "http://example.com/path%20with%20spaces";
        URL urlObj = new URL(url);
        UrlBuilder builder = new UrlBuilder(urlObj);
        URL result = builder.build();
        Assert.assertEquals("http://example.com/path with spaces", URLUtil.toString(result));
    }

    @Test
    public void testUrlEncoded() throws Exception {
        String url = "http://example.com/path?name=John+Doe";
        UrlBuilder builder = new UrlBuilder(null);
        URL result = builder.build();
        Assert.assertEquals("http://example.com/path?name=John%20Doe", URLUtil.toString(result));
    }

}

class KeyVal {
    private String key;
    private String value;

    public KeyVal(String key, String value) {
        this.key = key;
        this.value = value;
    }
}

class StringUtil {
    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            KeyVal other = (KeyVal) obj;
            return Objects.equals(key, other.key) && Objects.equals(value, other.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }

    public static boolean contains(String text, String substr) {
        return text.contains(substr.toString());
    }
}

class UrlBuilder {
    private URL url;

    public UrlBuilder(URL url) {
        this.url = url;
    }

    public URL build() throws Exception {
        return new URL(url.toString());
    }
}

class URLUtil {
    public static String toString(URL url) {
        try {
            return java.net.URLDecoder.decode(url.toString(), "UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

}