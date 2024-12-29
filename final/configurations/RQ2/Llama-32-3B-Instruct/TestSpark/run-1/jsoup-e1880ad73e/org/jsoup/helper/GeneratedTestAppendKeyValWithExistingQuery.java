package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestAppendKeyValWithExistingQuery {

    private String key;
    private String value;

    public KeyVal(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }
}

class UrlBuilder {

    private Connection connection;
    private Map<String, String> queryMap;

    public UrlBuilder(Connection connection) {
        this.connection = connection;
        this.queryMap = new HashMap<>();
    }

    public void appendKeyVal(KeyVal kv) {
        queryMap.put(kv.getKey(), kv.getValue());
    }

    public String build() {
        StringBuilder sb = new StringBuilder(connection.toString());
        if (queryMap != null && !queryMap.isEmpty()) {
            sb.append("?");
            for (Map.Entry<String, String> entry : queryMap.entrySet()) {
                if (sb.length() > 1) {
                    sb.append("&");
                }
                sb.append(entry.getKey()).append("=").append(entry.getValue());
            }
        }
        return sb.toString();
    }
}

public class GeneratedTest {

    @Test
    public void testAppendKeyValWithExistingQuery() {
        String baseUrl = "http://example.com";
        KeyVal kv1 = new KeyVal("key1", "value1");
        KeyVal kv2 = new KeyVal("key2", "value2");

        UrlBuilder urlBuilder = new UrlBuilder(new Connection(baseUrl));
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);

        String builtUrl = urlBuilder.build();
        assertTrue(builtUrl.contains("key1=value1"));
        assertTrue(builtUrl.contains("key2=value2"));
    }

}