package org.jsoup.helper;

public class GeneratedTestRequestBody {

    @Test
    public void testRequestBody() throws IOException {
        String url = "http://example.com";
        HttpConnection connection = new HttpConnection();
        assert connection.requestBody("GET", url) != null;
    }

}