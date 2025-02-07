package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestConnectCookies_Suffixes {

    @Test
    public void testConnectCookies_Suffixes() {
        String cookieStoreUrl = "https://example.com/cookies";
        CookieManager cookieManager = new CookieManager();
        HttpConnection connection = new HttpConnection(cookieStoreUrl);
        assertEquals("https://example.com", cookieManager.getCookieStore().getHost());
    }

}