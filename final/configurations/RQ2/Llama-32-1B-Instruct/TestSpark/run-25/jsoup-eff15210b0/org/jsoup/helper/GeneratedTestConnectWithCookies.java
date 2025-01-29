package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestConnectWithCookies {

    @Test
    public void testConnectWithCookies() {
        String url = "https://example.com";
        CookieManager cookieManager = new org.jsoup.cookie.CookieManager.Builder()
                .build();
        HttpConnection connection = new HttpConnection(cookieManager);
        assertEquals(url, connection.getUrl());
        assertNotNull(connection.getCookies());
    }

}