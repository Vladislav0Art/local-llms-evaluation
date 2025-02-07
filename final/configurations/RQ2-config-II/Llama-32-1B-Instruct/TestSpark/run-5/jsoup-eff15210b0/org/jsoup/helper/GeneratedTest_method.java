package org.jsoup.helper;

public class GeneratedTest_method {

    @Test
    public void test_method() {
        HttpConnection connection = new HttpConnection();
        String url = "http://example.com";
        Method method = Method.GET;
        Request request = new Request(method, url);
        Connection conn = connection.newRequest(request);
        assert conn != null;

        assertEquals(200, conn.execute().getStatusCode());
    }

}