package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestConnectWithCookieStore {

    @Test
    public void testConnectWithCookieStore() {
        String url = "https://example.com";
        CookieStore cookieStore = new org.jsoup.cookie.CookieStore.Builder()
                .build();
        HttpConnection connection = new HttpConnection(cookieStore);
        assertEquals(url, connection.getUrl());
        assertNotNull(connection.getCookie("session_id"));
    }

}