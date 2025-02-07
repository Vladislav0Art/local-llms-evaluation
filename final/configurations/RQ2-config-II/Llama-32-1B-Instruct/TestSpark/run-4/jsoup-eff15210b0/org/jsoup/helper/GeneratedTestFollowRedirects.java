package org.jsoup.helper;

public class GeneratedTestFollowRedirects {

    @Test
    public void testFollowRedirects() {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        connection.setFollowRedirects(true);
        Connection response = HttpConnection.connect(url).execute();
        assertEquals(200, response.getResponseCode());
    }

}