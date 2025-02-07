package org.jsoup.helper;

public class GeneratedTestTimeout {

    @Test
    public void testTimeout() throws InterruptedException {
        HttpURLConnection connection = (HttpURLConnection) HttpConnection.connect("https://example.com");
        connection.setRequestMethod("HEAD");
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 1000) {
        }
        assertEquals(500, connection.getResponseCode());
    }

}