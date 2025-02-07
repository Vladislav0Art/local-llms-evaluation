package org.jsoup.helper;

public class GeneratedTest_url_with_cookie {

    @Test
    public void test_url_with_cookie() {
        HttpConnection connection = new HttpConnection();
        String cookie = "testcookie";
        CookieStore cookieStore = new CookieStore(new URL("http://example.com"));
        Connection conn = connection.url(new URL("http://example.com"), cookieStore);
        assert conn == null; // This should be null, but we need to create a request object first

        Request request = new Request("GET", "http://example.com");
        conn = connection.newRequest(request);
        assert conn != null;

        assertEquals(200, conn.execute().getStatusCode());
    }

}