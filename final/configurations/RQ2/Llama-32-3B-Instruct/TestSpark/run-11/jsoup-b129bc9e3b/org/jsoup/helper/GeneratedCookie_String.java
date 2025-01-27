package org.jsoup.helper;

public class GeneratedCookie_String {

    @Test
    public void cookie_String() {
        String name = "value";
        HttpConnection connection = new HttpConnection();
        assertEquals(name, connection.cookie(name));
    }

}