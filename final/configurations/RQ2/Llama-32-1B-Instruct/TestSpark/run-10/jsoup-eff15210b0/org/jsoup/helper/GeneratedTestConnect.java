package org.jsoup.helper;

public class GeneratedTestConnect {

    @Test
    public void testConnect() {
        Connection connection = org.jsoup.helper.HttpConnection.connect("http://example.com");
        assertEquals("http://example.com", connection.getURL());
    }

}