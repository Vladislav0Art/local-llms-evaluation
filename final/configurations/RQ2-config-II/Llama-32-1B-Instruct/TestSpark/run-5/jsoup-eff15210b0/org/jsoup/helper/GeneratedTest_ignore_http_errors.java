package org.jsoup.helper;

public class GeneratedTest_ignore_http_errors {

    @Test
    public void test_ignore_http_errors() {
        HttpConnection connection = new HttpConnection();
        String url = "http://example.com";
        boolean ignoreHttpErrors = true;
        Request request = new Request(Method.GET, url);
        Connection conn = connection.newRequest(request);
        assert conn != null;

        assertEquals(200, conn.execute().getStatusCode());

        request = new Request(Method.GET, url);
        conn = connection.newRequest(request);
        assert conn != null;

        assertEquals(404, conn.execute().getStatusCode());
    }

}