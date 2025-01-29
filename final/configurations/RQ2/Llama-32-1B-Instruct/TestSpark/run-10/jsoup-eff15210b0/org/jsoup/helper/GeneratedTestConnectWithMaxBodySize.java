package org.jsoup.helper;

public class GeneratedTestConnectWithMaxBodySize {

    @Test
    public void testConnectWithMaxBodySize() {
        Connection connection = org.jsoup.helper.HttpConnection.connect("http://example.com");
        assertEquals("http://example.com", connection.getURL());
    }

}