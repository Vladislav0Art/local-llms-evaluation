package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;

public class GeneratedTestBuildUriConnectionKeyValUrlEncodedValue {

    @Mock
    private Connection connection;

    public static class URLUtil {
        public static URI buildUri(URI uri, Object kv) throws URISyntaxException {
            if (kv != null) {
                String key = ((Connection.KeyVal) kv).getKey();
                String value = ((Connection.KeyVal) kv).getValue();
                if (value == null) {
                    return uri;
                }
                return new URI(uri.getScheme(), uri.getHost(), uri.getPath() + "?" + key + "=" + URLDecoder.decode(value, "UTF-8"), uri.getQuery());
            } else {
                return uri;
            }
        }

    }

    public static class ConnectionKeyVal {
        private String key;
        private String value;

        public ConnectionKeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

}

public class UrlBuilderTest {

    @Test
    public void testBuildUriConnectionKeyValUrlEncodedValue() throws URISyntaxException {
        URI uri = new URI("http://localhost:8080", null, "/path/to/resource", null);
        Connection.KeyVal kv = new org.jsoup.helper.Connection.KeyVal("key", "value");
        URI result = URLUtil.buildUri(uri, kv);
        assertEquals(result.getScheme(), "http");
        assertEquals(result.getHost(), "localhost");
        assertEquals(result.getPath(), "/path/to/resource?key=value");
    }

}