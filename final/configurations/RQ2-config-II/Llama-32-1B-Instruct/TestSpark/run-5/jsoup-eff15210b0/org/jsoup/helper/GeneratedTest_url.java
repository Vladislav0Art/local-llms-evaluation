package org.jsoup.helper;

public class GeneratedTest_url {

    @Test
    public void test_url() {
        HttpConnection connection = new HttpConnection();
        String url = "http://example.com";
        Connection conn = connection.url(url);
        assert conn == null; // This should be null, but we need to create a request object first

        Request request = new Request("GET", url);
        conn = connection.newRequest(request);
        assert conn != null;

        assertEquals(200, conn.execute().getStatusCode());
    }

}