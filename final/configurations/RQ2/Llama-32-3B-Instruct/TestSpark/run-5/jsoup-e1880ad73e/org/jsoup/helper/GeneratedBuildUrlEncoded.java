package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedBuildUrlEncoded {

    @Test
    public void buildUrlEncoded() throws UnsupportedEncodingException, MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?name=John+Doe";
        UrlBuilder builder = new UrlBuilder(null);
        URL result = builder.build();
        assertEquals("http://example.com/path?name=John%20Doe", URLUtil.toString(result));
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
        return text.contains(substr);
    }

}

class URLUtil {
    public static String toString(URL url) {
        try {
            return URLDecoder.decode(url.toString(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

}