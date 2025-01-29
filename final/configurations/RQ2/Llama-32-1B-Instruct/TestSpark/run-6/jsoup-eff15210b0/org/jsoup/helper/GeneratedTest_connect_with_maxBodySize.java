package org.jsoup.helper;

public class GeneratedTest_connect_with_maxBodySize {

    private static final String URL = "https://example.com";

    @Test
    public void test_connect_with_maxBodySize() throws IOException {
        HttpConnection connection = new HttpConnection(1000000);
        Connection response = connection.connect(URL);
        assert response == null;
    }

}