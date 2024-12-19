package org.jsoup.helper;

public class GeneratedTestIgnoreHttpErrors {

    private Connection connection;
    private URL url;

    @Test
    public void testIgnoreHttpErrors() {
        ignore_http_errors = true;
        connection = HttpConnection.connect();
        connection.setIgnoreHttpErrors(ignore_http_errors);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        assertEquals(true, connection.ignoreHttpErrors());
    }

}