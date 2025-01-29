package org.jsoup.helper;

public class GeneratedTestConnectWithParams {

    @Test
    public void testConnectWithParams() {
        Connection connection = org.jsoup.helper.HttpConnection.connect("http://example.com?param=value");
        assertEquals("http://example.com?param=value", connection.getURL());
    }

}