package org.jsoup.helper;

public class GeneratedTestFollowRedirects {

    @Test
    public void testFollowRedirects() {
        HttpConnection connection = HttpConnection.connect("http://example.com", true);
        assertNotNull(connection);
        assertEquals(true, connection.followRedirects());
    }

}