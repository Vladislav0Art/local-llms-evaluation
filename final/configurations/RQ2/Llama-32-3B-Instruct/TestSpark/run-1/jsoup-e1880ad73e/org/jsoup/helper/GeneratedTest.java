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

public class GeneratedTest {

    private String key;
    private String value;

    public static KeyVal of(String key, String value) {
        return new KeyVal(key, value);
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
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

}