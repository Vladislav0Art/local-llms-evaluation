package org.jsoup.helper;

public class GeneratedTestMaxBodySize {

    @Test
    public void testMaxBodySize() {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        assert connection.maxBodySize(1024 * 1024); // 1MB
    }

}