package org.jsoup.helper;

public class GeneratedTestIgnoreHttpErrors {

    @Test
    public void testIgnoreHttpErrors() {
        Connection response = HttpConnection.connect("https://example.com").execute(1000);
        assertEquals(200, response.getResponseCode());
    }

}