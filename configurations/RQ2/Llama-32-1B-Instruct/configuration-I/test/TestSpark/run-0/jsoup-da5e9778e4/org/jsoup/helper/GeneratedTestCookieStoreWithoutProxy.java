package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestCookieStoreWithoutProxy {

    @Test
    public void testCookieStoreWithoutProxy() {
        HttpConnection connection = new HttpConnection();
        CookieStore cookieStore = new CookieStore();
        connection.setCookieStore(cookieStore);
        String url = "http://example.com";
        Connection response = connection.get(url, null);
        assertNotNull(response);
    }

}