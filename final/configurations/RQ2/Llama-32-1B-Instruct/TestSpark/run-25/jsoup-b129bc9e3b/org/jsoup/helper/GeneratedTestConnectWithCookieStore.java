package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectWithCookieStore {

    @Test
    public void testConnectWithCookieStore() throws InterruptedException {
        CookieStore cookieStore = new CookieStore();
        URL url = new URL("http://example.com");
        HttpConnection connection = (HttpConnection) HttpConnection.connect(url, null);
        assertEquals(true, connection instanceof HttpConnection.CookieStore);

        cookieStore.setCookies(null);

        Thread.sleep(5000);

        String cookies = cookieStore.getCookieString();

        assertEquals(cookies, "some-cookies", "Unexpected cookies");
    }

}