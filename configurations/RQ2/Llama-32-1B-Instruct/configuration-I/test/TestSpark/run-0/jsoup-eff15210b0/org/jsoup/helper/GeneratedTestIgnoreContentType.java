package org.jsoup.helper;

public class GeneratedTestIgnoreContentType {

    private Connection connection;
    private URL url;

    @Test
    public void testIgnoreContentType() {
        ignore_content_type = true;
        connection = HttpConnection.connect();
        connection.setIgnoreContentType(ignore_content_type);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        assertEquals(true, connection.ignoreContentType());
    }

}