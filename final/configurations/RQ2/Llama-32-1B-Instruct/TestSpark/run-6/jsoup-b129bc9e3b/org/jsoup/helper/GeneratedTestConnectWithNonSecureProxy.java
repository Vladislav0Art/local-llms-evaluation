package org.jsoup.helper;

public class GeneratedTestConnectWithNonSecureProxy {

    private static final String mockCookieManager = "mock_cookie_manager";
    private static final String mockCookieStore = "mock_cookie_store";

    @Test
    public void testConnectWithNonSecureProxy() {
        HttpConnection connection = new HttpConnection();
        String proxyHost = "proxy.example.com";
        int proxyPort = 8080;
        Proxy proxyFactory = mock(Proxy.class);
        connection.proxy(proxyFactory, proxyPort);
        assertEquals(mockCookieManager, (String) getMockValue(connection, "https://example.com"));
    }

}