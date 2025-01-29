package org.jsoup.helper;

public class GeneratedTest_connect {

    private static final String URL = "https://example.com";

    @Test
    public void test_connect() {
        HttpConnection connection = new HttpConnection();
        Connection response = connection.connect(URL);
        assert response == null;
    }

}