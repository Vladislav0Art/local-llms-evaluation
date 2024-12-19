package org.jsoup.helper;

public class GeneratedTestTimeout {

    private Connection connection;
    private URL url;

    @Test
    public void testTimeout() {
        connection = HttpConnection.connect();
        connection.setTimeout(10000);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        assertEquals(-1, connection.timeout(2000));
    }

}