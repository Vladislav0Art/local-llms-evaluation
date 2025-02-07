package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestConnectCookies {

    @Test
    public void testConnectCookies() {
        String cookieStoreUrl = "https://example.com/cookies";
        CookieManager cookieManager = new CookieManager();
        HttpConnection connection = new HttpConnection(cookieStoreUrl);
        assertNotNull(connection.cookieStore());
        assertEquals("https://example.com", connection.getCookieStore().getHost());
    }

}