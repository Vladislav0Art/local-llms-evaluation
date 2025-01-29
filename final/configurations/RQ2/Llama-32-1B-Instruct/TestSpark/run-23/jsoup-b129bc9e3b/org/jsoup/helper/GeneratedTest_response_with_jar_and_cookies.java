package org.jsoup.helper;

public class GeneratedTest_response_with_jar_and_cookies {

    private static final String HOST = "example.com";
    private static final int PORT = 443;

    @Test
    public void test_response_with_jar_and_cookies() {
        Request request = new Request();
        // create content
        String body = "Hello World!";
        Connection connection = HttpConnection.connect(new URL("https://www.example.com"));
        request.setBody(body);
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookieStore(new CookieStore(cookieManager));
        ((HttpConnection) connection).response().setCookieStore(cookieManager);
        ((HttpConnection) ((HttpConnection) connection).request(request)).setCookieStore(cookieManager);
        assertEquals(body, ((HttpConnection) ((HttpConnection) ((HttpConnection) connection).response())).getValue());
    }

}