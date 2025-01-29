package org.jsoup.helper;

public class GeneratedTestConnectWithIgnoreHttpErrors {

    @Test
    public void testConnectWithIgnoreHttpErrors() {
        Connection connection = org.jsoup.helper.HttpConnection.connect("http://example.com");
        assertTrue(connection.ignoreHttpErrors(true));
    }

}