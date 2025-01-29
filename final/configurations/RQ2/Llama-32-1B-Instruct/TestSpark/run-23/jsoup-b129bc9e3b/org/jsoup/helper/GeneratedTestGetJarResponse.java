package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestGetJarResponse {

    @Test
    public void testGetJarResponse() throws Exception {
        // setup cookies
        CookieStore cookieStore = new CookieStore(null);

        // get a response and then the cookie
        HttpConnectionResponse response = MainHttpConnection.get("http://example.com/jar", null, null);
        String jarValue = response.getJar();

        // check if the cookie is correct
        assertEquals("value", cookieStore.getCookie());
    }

}