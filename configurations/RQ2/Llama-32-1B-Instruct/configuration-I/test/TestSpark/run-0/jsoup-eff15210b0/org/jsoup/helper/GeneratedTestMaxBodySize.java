package org.jsoup.helper;

public class GeneratedTestMaxBodySize {

    private Connection connection;
    private URL url;

    @Test
    public void testMaxBodySize() {
        body_size = 1024;
        connection = HttpConnection.connect();
        connection.setMaxBodySize(body_size);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        assertEquals(body_size, connection.getMaxBodySize());
    }

}