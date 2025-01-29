package org.jsoup.helper;

public class GeneratedTestConnectWithIgnoreContentType {

    @Test
    public void testConnectWithIgnoreContentType() {
        Connection connection = org.jsoup.helper.HttpConnection.connect("http://example.com");
        assertTrue(connection.ignoreContentType(false));
    }

}