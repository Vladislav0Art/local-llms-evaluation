package org.jsoup.helper;

public class GeneratedTestConnectWithRedirectFollows {

    @Test
    public void testConnectWithRedirectFollows() {
        Connection connection = org.jsoup.helper.HttpConnection.connect("http://example.com");
        assertTrue(connection.followRedirects(true));
    }

}