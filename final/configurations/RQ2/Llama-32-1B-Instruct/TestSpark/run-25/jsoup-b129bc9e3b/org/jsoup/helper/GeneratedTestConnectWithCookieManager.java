package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectWithCookieManager {

    @Test
    public void testConnectWithCookieManager() throws InterruptedException {
        CookieManager cookieManager = new CookieManager();
        URL url = new URL("http://example.com");
        HttpConnection connection = (HttpConnection) HttpConnection.connect(url, null);
        assertEquals(true, connection instanceof HttpConnection.CookieStore);
        cookieManager.setCookies(null);

        Thread.sleep(5000);

        String cookies = cookieManager.getCookieString();

        assertEquals(cookies, "some-cookies", "Unexpected cookies");
    }

}