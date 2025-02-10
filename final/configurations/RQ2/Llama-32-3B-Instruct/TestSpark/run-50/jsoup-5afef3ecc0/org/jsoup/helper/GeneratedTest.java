package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class GeneratedTest {

    private URL url;
    private StringBuilder query = new StringBuilder();

    public UrlBuilder(URL inputUrl) {
        this.url = inputUrl;
    }

    public String build() {
        return url.toString();
    }

    public void appendKeyVal(String key, String val) throws UnsupportedEncodingException {
        if (query.length() > 0) {
            query.append("&");
        }
        query.append(key).append("=").append(URLEncoder.encode(val));
    }
}

public class StringUtil {
    public static class KeyVal {
        private String key;
        private String val;

        public KeyVal(String key, String val) {
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return val;
        }
    }
}

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert .*;
        import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class UrlBuilderTest {

    @Test
    public void constructorFromUrlIsValidTest() {
        String urlStr = "https://www.example.com";
        URL urlObj = new URL(urlStr);
        UrlBuilder builder = new UrlBuilder(urlObj);
        assertNotNull(builder.build());
    }

    @Test
    public void buildNoQueryParamsTest() throws URISyntaxException, UnsupportedEncodingException {
        String urlStr = "https://www.example.com";
        UrlBuilder builder = new UrlBuilder(new URL(urlStr));
        assertEquals("https://www.example.com", builder.build());
    }

    @Test
    public void buildWithQueryParamsTest() throws URISyntaxException, UnsupportedEncodingException {
        String urlStr = "https://www.example.com?param1=value1&param2=value2";
        UrlBuilder builder = new UrlBuilder(new URL(urlStr));
        assertEquals("https://www.example.com?param1=value1&param2=value2", builder.build());
    }

    @Test
    public void appendKeyValueWithValidKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("https://www.example.com"));
        builder.appendKeyVal("key", "value");
        assertEquals("key=value", builder.query.toString());
    }

    @Test
    public void appendKeyValueWithInvalidKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("https://www.example.com"));
        try {
            builder.appendKeyVal("key", "\nvalue");
            assert false;
        } catch (UnsupportedEncodingException e) {
            assertEquals(true, true);
        }
    }

}