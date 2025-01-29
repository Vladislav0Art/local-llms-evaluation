package org.jsoup.helper;

public class GeneratedTestRequest {

    private static final String mockCookieManager = "mock_cookie_manager";
    private static final String mockCookieStore = "mock_cookie_store";

    @Test
    public void testRequest() {
        HttpConnection connection = new HttpConnection();
        Request request = new Request();
        assertNotEquals(0, mock(HttpConnection.class).request().id());
        assertEquals(mockCookieManager, (String) getMockValue(connection, "https://example.com"));
    }

}