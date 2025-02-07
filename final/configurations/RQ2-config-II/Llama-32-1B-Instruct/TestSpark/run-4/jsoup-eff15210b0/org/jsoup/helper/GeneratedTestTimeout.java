package org.jsoup.helper;

public class GeneratedTestTimeout {

    @Test
    public void testTimeout() {
        int millis = 1000;
        Connection response = HttpConnection.connect("http://example.com").execute(1000);
        assertEquals(200, response.getResponseCode());
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}