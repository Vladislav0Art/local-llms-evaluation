package org.jsoup.helper;

public class GeneratedTestFollowRedirects {

    @Test
    public void testFollowRedirects() throws IOException {
        HttpURLConnection connection = (HttpURLConnection) HttpConnection.connect("https://example.com");
        connection.setRequestMethod("HEAD");
        int redirectCode = connection.getResponseCode();
        assertEquals(301, redirectCode);
    }

}