package org.jsoup.helper;

public class GeneratedTestRequestWithNonSecureProxy {

    private static final String mockCookieManager = "mock_cookie_manager";
    private static final String mockCookieStore = "mock_cookie_store";

    @Test
    public void testRequestWithNonSecureProxy() {
        HttpConnection connection = new HttpConnection();
        String proxyHost = "proxy.example.com";
        int proxyPort = 8080;
        Proxy proxyFactory = mock(Proxy.class);
        connection.proxy(proxyFactory, proxyPort);
        Request request = new Request();
        assertNotEquals(0, mock(HttpConnection.class).request().id());
        assertEquals(mockCookieManager, (String) getMockValue(connection, "https://example.com"));
    }

}