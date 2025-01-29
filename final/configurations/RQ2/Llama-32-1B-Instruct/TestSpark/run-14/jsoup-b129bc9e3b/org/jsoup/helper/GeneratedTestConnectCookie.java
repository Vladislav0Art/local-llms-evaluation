package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestConnectCookie {

    @Test
    public void testConnectCookie() {
        String name = "cookie_name";
        String value = "cookie_value";
        Map<String, String> cookies = new HashMap<>();
        cookies.put(name, value);
        HttpConnection connection = new HttpConnection(cookieStore(new CookieManager()));
        assertEquals(cookies.get(name), connection.cookie("cookie_name", "");
    }

}