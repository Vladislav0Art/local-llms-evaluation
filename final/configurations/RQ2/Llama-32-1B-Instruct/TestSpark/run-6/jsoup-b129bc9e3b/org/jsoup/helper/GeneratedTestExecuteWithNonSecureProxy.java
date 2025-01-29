package org.jsoup.helper;

public class GeneratedTestExecuteWithNonSecureProxy {

    private static final String mockCookieManager = "mock_cookie_manager";
    private static final String mockCookieStore = "mock_cookie_store";

    @Test
    public void testExecuteWithNonSecureProxy() {
        HttpConnection connection = new HttpConnection();
        Response response = mock(Response.class);
        String proxyHost = "proxy.example.com";
        int proxyPort = 8080;
        Proxy proxyFactory = mock(Proxy.class);
        connection.proxy(proxyFactory, proxyPort);
        connect("http://example.com");
        try {
            assertNotEquals(0, mock(HttpConnection.class).execute().id());
            fail("Expected exception not thrown");
        } catch (URISyntaxException e) {
            assertEquals(mockCookieManager, getMockValue(connection, "https://example.com"));
        }
    }

    private Object mock(Class<?> clazz) {
        return mock(clazz);
    }

}