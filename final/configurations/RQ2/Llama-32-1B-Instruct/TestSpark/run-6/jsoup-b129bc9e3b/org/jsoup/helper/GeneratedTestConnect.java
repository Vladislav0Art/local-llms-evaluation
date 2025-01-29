package org.jsoup.helper;

public class GeneratedTestConnect {

    private static final String mockCookieManager = "mock_cookie_manager";
    private static final String mockCookieStore = "mock_cookie_store";

    @Test
    public void testConnect() {
        HttpConnection connection = new HttpConnection();
        assertEquals(mockCookieManager, connection.get().cookieStore());
    }

}