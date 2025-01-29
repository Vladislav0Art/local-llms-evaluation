package org.jsoup.helper;

public class GeneratedTestUrlEncode {

    private static final String mockCookieManager = "mock_cookie_manager";
    private static final String mockCookieStore = "mock_cookie_store";

    @Test
    public void testUrlEncode() {
        URL url = new URL("https://example.com");
        String encodedUrl = encodeUrl(url);
        assertEquals(mockCookieManager, (String) getMockValue(connection, "https://example.com"));
    }

}