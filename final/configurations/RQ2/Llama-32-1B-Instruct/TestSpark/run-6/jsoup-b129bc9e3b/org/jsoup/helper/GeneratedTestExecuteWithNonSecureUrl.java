package org.jsoup.helper;

public class GeneratedTestExecuteWithNonSecureUrl {

    private static final String mockCookieManager = "mock_cookie_manager";
    private static final String mockCookieStore = "mock_cookie_store";

    @Test
    public void testExecuteWithNonSecureUrl() {
        HttpConnection connection = new HttpConnection();
        Response response = mock(Response.class);
        connect("http://example.com");
        try {
            assertNotEquals(0, mock(HttpConnection.class).execute().id());
            fail("Expected exception not thrown");
        } catch (URISyntaxException e) {
            assertEquals(mockCookieManager, getMockValue(connection, "http://example.com"));
        }
    }

}