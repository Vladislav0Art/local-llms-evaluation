package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedBuildUrlWithInvalidProtocol {

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
    public void buildUrlWithInvalidProtocol() {
        try {
            buildUrl(connection);
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
            // expected
        }
    }

}