package org.jsoup.helper;

public class GeneratedTest_ignore_content_type {

    @Test
    public void test_ignore_content_type() {
        HttpConnection connection = new HttpConnection();
        String url = "http://example.com";
        boolean ignoreContentType = true;
        Request request = new Request(Method.GET, url);
        Connection conn = connection.newRequest(request);
        assert conn != null;

        assertEquals(200, conn.execute().getStatusCode());

        request = new Request(Method.GET, url);
        conn = connection.newRequest(request);
        assert conn != null;

        assertEquals(405, conn.execute().getStatusCode());
    }

}