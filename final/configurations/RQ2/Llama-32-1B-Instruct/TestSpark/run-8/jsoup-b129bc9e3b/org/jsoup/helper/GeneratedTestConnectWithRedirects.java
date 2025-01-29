package org.jsoup.helper;

public class GeneratedTestConnectWithRedirects {

    private static final String HTTP_VERSION = "HTTP/1.1";

    @Test
    public void testConnectWithRedirects() {
        HttpConnection connection = HttpConnection.connect("http://example.com");
        connection.setFollowRedirects(true);
        String redirectedUrl = "https://redirected.example.com";
        Assert.assertTrue(connection.url(redirectedUrl).isRedirected());
    }

}