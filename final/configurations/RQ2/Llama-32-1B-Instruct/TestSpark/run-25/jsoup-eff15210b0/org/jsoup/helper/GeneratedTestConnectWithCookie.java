package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestConnectWithCookie {

    @Test
    public void testConnectWithCookie() {
        String url = "https://example.com";
        CookieManager cookieManager = new org.jsoup.cookie.CookieManager.Builder()
                .build();
        HttpConnection connection = new HttpConnection(cookieManager);
        assertEquals(url, connection.getUrl());
        assertNotNull(connection.getCookie("session_id"));
    }

}