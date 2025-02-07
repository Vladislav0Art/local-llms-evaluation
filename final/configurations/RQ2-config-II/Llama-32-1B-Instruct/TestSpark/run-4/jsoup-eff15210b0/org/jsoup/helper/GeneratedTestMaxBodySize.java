package org.jsoup.helper;

public class GeneratedTestMaxBodySize {

    @Test
    public void testMaxBodySize() {
        int bytes = 1024;
        Connection response = HttpConnection.connect("http://example.com").execute(1024);
        assertEquals(200, response.getResponseCode());
        try {
            Thread.sleep(bytes);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}