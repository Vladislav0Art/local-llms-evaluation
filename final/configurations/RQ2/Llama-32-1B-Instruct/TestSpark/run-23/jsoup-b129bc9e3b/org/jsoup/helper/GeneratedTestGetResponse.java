package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestGetResponse {

    @Test
    public void testGetResponse() throws Exception {
        // setup cookies
        CookieManager cookieManager = new CookieManager(null);

        // get a response and then the cookie
        HttpConnectionResponse response = MainHttpConnection.get("http://example.com/cookie", null, null);
        String cookieValue = response.getCookie();

        // check if the cookie is correct
        assertEquals("value", cookieManager.getCookie());
    }

}