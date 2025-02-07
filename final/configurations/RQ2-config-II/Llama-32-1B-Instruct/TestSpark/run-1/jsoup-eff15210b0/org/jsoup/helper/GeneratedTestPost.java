package org.jsoup.helper;

public class GeneratedTestPost {

    @Test
    public void testPost() throws IOException {
        HttpURLConnection connection = (HttpURLConnection) HttpConnection.connect("https://example.com");
        String body = "{\"key\":\"value\"}";
        InputStream inputStream = connection.getOutputStream().write(body.getBytes());
        assertEquals(200, connection.getResponseCode());
    }

}