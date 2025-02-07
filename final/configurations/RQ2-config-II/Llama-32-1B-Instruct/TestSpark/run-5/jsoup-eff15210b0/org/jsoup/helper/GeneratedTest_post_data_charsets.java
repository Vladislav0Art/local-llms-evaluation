package org.jsoup.helper;

public class GeneratedTest_post_data_charsets {

    @Test
    public void test_post_data_charsets() {
        HttpConnection connection = new HttpConnection();
        String url = "http://example.com";
        Request request = new Request("POST", "http://example.com");
        Connection conn = connection.newRequest(request);
        assert conn != null;

        assertEquals(200, conn.execute().getStatusCode());
    }

}