package org.jsoup.helper;

public class GeneratedTestFollowRedirects {

    private Connection connection;
    private URL url;

    @Test
    public void testFollowRedirects() {
        redirect = true;
        connection = HttpConnection.connect();
        connection.setFollowRedirects(redirect);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        assertEquals(true, connection.followRedirects());
    }

}