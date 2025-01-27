package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.util.DataUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

public class GeneratedAppendQueryValueTest {

    @Test
    public void appendQueryValueTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String query = "key=value";
        builder.appendQueryValue(query);
        assertTrue(builder.build().toString().contains("?key=value"));
    }

}

class StringUtil {
    public static boolean hasNonEmptyValue(String url) {
        return !url.isEmpty();
    }
}

public class UrlBuilder {
    private URL url;

    public UrlBuilder(URL url) {
        this.url = url;
    }

    public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
        String value = "value";
        if (kv == null) {
            return;
        }
        // implementation
    }

    public void appendQueryValue(String query) throws UnsupportedEncodingException {
        // implementation
    }

    public URL build() {
        // implementation
        return url;
    }
}

public class Connection {
    public static class KeyVal implements java.lang.Object {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public KeyVal(String key, Object value) {
        }

        // implementation
    }

}