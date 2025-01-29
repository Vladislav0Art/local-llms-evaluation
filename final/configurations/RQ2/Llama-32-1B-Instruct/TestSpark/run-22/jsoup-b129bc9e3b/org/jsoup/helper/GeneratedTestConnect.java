package org.jsoup.helper;

public class GeneratedTestConnect {

    @Test
    public void testConnect() {
        HttpConnection connection = new HttpConnection();
        assertEquals("http://example.com", connection.connect("http://example.com").getHost());
    }

}