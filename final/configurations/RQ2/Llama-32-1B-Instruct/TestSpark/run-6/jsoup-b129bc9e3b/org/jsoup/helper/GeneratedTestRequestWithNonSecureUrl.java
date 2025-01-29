package org.jsoup.helper;

public class GeneratedTestRequestWithNonSecureUrl {

    private static final String mockCookieManager = "mock_cookie_manager";
    private static final String mockCookieStore = "mock_cookie_store";

    @Test
    public void testRequestWithNonSecureUrl() {
        HttpConnection connection = new HttpConnection();
        Request request = new Request();
        try {
            connect("http://example.com");
            fail("Expected exception not thrown");
        } catch (URISyntaxException e) {
            assertEquals(mockCookieManager, getMockValue(connection, "http://example.com"));
        }
    }

}