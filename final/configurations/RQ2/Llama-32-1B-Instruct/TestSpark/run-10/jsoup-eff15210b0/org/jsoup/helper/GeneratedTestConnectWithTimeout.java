package org.jsoup.helper;

public class GeneratedTestConnectWithTimeout {

    @Test
    public void testConnectWithTimeout() {
        Connection connection = org.jsoup.helper.HttpConnection.connect("http://example.com", 10000);
        assertEquals("http://example.com", connection.getURL());
    }

}