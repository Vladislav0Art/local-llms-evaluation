package org.jsoup.helper;

public class GeneratedTest_header {

    @Test
    public void test_header() {
        HttpConnection connection = new HttpConnection();
        String url = "http://example.com";
        CookieStore cookieStore = new CookieStore(new URL("http://example.com"));
        Connection conn = connection.url(new URL("http://example.com"), cookieStore);
        Request request = new Request("GET", url, cookieStore);
        conn = connection.newRequest(request);
        assert conn != null;

        assertEquals(200, conn.execute().getStatusCode());
    }

}