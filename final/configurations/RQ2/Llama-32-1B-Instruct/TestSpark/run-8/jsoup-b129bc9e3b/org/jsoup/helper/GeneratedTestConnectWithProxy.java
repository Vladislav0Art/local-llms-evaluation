package org.jsoup.helper;

public class GeneratedTestConnectWithProxy {

    private static final String HTTP_VERSION = "HTTP/1.1";

    @Test
    public void testConnectWithProxy() {
        HttpConnection connection = HttpConnection.connect("http://proxy.example.com:8080");
        Assert.assertTrue(connection.getProxy() != null);
        Assert.assertEquals("proxy.example.com", connection.getProxy().getHost());
        Assert.assertEquals(8080, connection.getProxy().getPort());
    }

}