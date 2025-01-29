package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectCookies {

    @Test
    public void testConnectCookies() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> cookies = new HashMap<>();
        cookies.put("test1", "value1");
        cookies.put("test2", "value2");
        assertEquals(cookies, connection.cookies());
    }

}