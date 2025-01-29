package org.jsoup.helper;

public class GeneratedTestConnectWithIgnoreContentType {

    private static final String HTTP_VERSION = "HTTP/1.1";

    @Test
    public void testConnectWithIgnoreContentType() {
        HttpConnection connection = HttpConnection.connect("http://example.com");
        connection.setIgnoreContentType(true);
        Assert.assertTrue(connection.getData("key", "value").isEmpty());
    }

}