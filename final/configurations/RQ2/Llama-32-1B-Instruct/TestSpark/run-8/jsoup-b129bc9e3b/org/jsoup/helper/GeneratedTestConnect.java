package org.jsoup.helper;

public class GeneratedTestConnect {

    private static final String HTTP_VERSION = "HTTP/1.1";

    @Test
    public void testConnect() {
        HttpConnection connection = HttpConnection.connect("http://example.com");
        Assert.assertTrue(connection.getUri().getHost().equals("example.com"));
        Assert.assertTrue(connection.getScheme().equals("https"));
    }

}