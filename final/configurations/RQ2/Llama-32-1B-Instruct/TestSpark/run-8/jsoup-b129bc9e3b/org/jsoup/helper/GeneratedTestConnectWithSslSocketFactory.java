package org.jsoup.helper;

public class GeneratedTestConnectWithSslSocketFactory {

    private static final String HTTP_VERSION = "HTTP/1.1";

    @Test
    public void testConnectWithSslSocketFactory() {
        HttpConnection connection = HttpConnection.connect("https://example.com");
        SSLSocketFactory sslSocketFactory = new org.jsoup.helper.HttpsSSLClientSocketFactory();
        Assert.assertNotNull(connection.getSockets().get(0).getSocketFactory());
        Assert.assertEquals(sslSocketFactory, connection.getSockets().get(0).getSocketFactory());
    }

}