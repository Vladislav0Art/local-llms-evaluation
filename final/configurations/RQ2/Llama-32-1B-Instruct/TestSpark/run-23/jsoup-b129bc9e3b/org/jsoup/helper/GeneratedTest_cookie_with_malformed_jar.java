package org.jsoup.helper;

public class GeneratedTest_cookie_with_malformed_jar {

    private static final String HOST = "example.com";
    private static final int PORT = 443;

    @Test
    public void test_cookie_with_malformed_jar() {
        String cookies = "JSESSIONID=junk; JSESSIONID=another-junk; SessionId=junk";
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookieStore(new CookieStore(cookieManager));
        URL url = new URL("https://www.example.com");
        try {
            HttpConnection.connect(url);
            fail("Expected IOException: Malformed jar cookie string");
        } catch (IOException e) {
            assertEquals(403, e.getStatusCode());
        }
    }

}