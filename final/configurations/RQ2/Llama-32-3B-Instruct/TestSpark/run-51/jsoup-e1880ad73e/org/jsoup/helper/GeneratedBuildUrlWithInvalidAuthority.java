package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedBuildUrlWithInvalidAuthority {

    @Mock
    private Connection connection;

    public static String encodedKeyVal(KeyVal kv) {
        StringBuilder sb = new StringBuilder(kv.getKey());
        if (!StringUtil.isEmpty(kv.getValue())) {
            sb.append("=").append(URLEncoder.encode(kv.getValue(), org.jsoup.helper.DataUtil.UTF_8));
        }
        return sb.toString();
    }

    @Test
    public void buildUrlWithInvalidAuthority() {
        String invalidAuthority = "invalid:authority";
        UrlBuilder buildUrl = new UrlBuilder();
        buildUrl.setUrl("https://" + invalidAuthority);
        buildUrl.buildUrl(connection);
    }
}

public class KeyVal {
    private String key;
    private String value;

    public KeyVal(String key, String value) {
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

public class StringUtil {

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
}

public class UrlBuilder {

    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String buildUrl(Connection connection) {
        // implement URL building logic
        return url;
    }

}