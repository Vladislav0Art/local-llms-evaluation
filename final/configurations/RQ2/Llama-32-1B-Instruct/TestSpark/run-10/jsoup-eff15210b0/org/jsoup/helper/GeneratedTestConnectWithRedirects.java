package org.jsoup.helper;

public class GeneratedTestConnectWithRedirects {

    @Test
    public void testConnectWithRedirects() {
        Connection connection = org.jsoup.helper.HttpConnection.connect("http://example.com");
        assertEquals("https://example.com", connection.getURL());
    }

}