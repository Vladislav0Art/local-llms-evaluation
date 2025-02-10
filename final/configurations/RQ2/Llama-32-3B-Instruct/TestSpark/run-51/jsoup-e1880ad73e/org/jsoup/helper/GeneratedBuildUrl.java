package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedBuildUrl {

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
    public void buildUrl() {
        UrlBuilder buildUrl = new UrlBuilder(connection);
        assert buildUrl != null;
    }

    private static String buildUrl(Connection connection) {
        return "https://example.com";
    }

    @Mock
    public class UrlBuilder {
        public static void appendKeyVal(Connection connection, KeyVal kv, String charset) {
            // implementation
        }

        public static String buildUrl(Connection connection) {
            // implementation
            return "https://example.com";
        }
    }

}