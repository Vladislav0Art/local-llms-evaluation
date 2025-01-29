package org.jsoup.helper;

public class GeneratedTestHeadResponse {

    @Test
    public void testHeadResponse() throws IOException {
        String url = "http://example.com";
        HttpConnection connection = new HttpConnection();
        connection = connection.connect(url);
        HttpURLConnection connection1 = (HttpURLConnection) connection.getResponse();
        assertEquals(200, connection1.getResponseCode());
    }

}