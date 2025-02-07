package org.jsoup.helper;

public class GeneratedTestIgnoreContentType {

    @Test
    public void testIgnoreContentType() {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        connection.setIgnoreContentType(true);
        Connection response = HttpConnection.connect(url).execute();
        assertEquals(200, response.getResponseCode());
    }

}