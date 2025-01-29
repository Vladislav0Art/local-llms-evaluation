package org.jsoup.helper;

public class GeneratedTestConnectWithCookie {

    private static final String mockCookieManager = "mock_cookie_manager";
    private static final String mockCookieStore = "mock_cookie_store";

    @Test
    public void testConnectWithCookie() {
        HttpConnection connection = new HttpConnection();
        String cookie = "mock_cookie";
        connection.setCookie(cookie);
        assertEquals(mockCookieManager, (String) getMockValue(connection, "https://example.com"));
    }

    private Object getMockValue(HttpConnection connection, String url) {
        return (Object) connection.get().cookieStore();
    }

}