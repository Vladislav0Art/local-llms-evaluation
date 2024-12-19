package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestCookieStoreWithProxy {

    @Test
    public void testCookieStoreWithProxy() {
        HttpConnection connection = new HttpConnection();
        CookieStore cookieStore = new CookieStore();
        Proxy proxy = new org.jsoup.helper.HttpProxy("192.168.1.100", 8080);
        connection.setProxy(proxy, "http://example.com");
        connection.setCookieStore(cookieStore);
        String url = "http://example.com";
        Connection response = connection.get(url, null);
        assertNotNull(response);
    }

}