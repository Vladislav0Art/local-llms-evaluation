package org.jsoup.helper;

public class GeneratedTest_request {

    @Test
    public void test_request() {
        HttpConnection connection = new HttpConnection();
        String url = "http://example.com";
        Request request = new Request("GET", url, new CookieStore(new URL("http://example.com")));
        Connection conn = connection.newRequest(request);
        assert conn != null;

        assertEquals(200, conn.execute().getStatusCode());
    }

}