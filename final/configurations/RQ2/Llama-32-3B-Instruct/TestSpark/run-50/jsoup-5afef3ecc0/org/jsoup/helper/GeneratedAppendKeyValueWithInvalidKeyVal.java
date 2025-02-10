package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class GeneratedAppendKeyValueWithInvalidKeyVal {

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