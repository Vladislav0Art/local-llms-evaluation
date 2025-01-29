package org.jsoup.helper;

public class GeneratedTestConnectToNonSecureUrl {

    private static final String mockCookieManager = "mock_cookie_manager";
    private static final String mockCookieStore = "mock_cookie_store";

    @Test
    public void testConnectToNonSecureUrl() {
        HttpConnection connection = new HttpConnection();
        try {
            connect("http://example.com");
            fail("Expected exception not thrown");
        } catch (URISyntaxException e) {
            assertEquals(mockCookieManager, getMockValue(connection, "http://example.com"));
        }
    }

}