package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedBuildUrlWithConnection {

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
    public void buildUrlWithConnection() {
        String expected = "https://example.com";
        UrlBuilder buildUrl = new UrlBuilder();
        buildUrl.setUrl("https://example.com");
        assert buildUrl.buildUrl(connection) == expected;
    }

}