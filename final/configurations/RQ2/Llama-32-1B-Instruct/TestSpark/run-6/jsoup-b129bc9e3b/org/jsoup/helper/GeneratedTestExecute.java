package org.jsoup.helper;

public class GeneratedTestExecute {

    private static final String mockCookieManager = "mock_cookie_manager";
    private static final String mockCookieStore = "mock_cookie_store";

    @Test
    public void testExecute() {
        HttpConnection connection = new HttpConnection();
        Response response = mock(Response.class);
        Connection.Request request = mock(Request.class);
        assertNotEquals(0, mock(HttpConnection.class).execute().id());
        assertEquals(mockCookieManager, (String) getMockValue(connection, "https://example.com"));
    }

}