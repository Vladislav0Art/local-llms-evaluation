package org.jsoup.helper;

public class GeneratedUrl_MakesNewRequest {

    @Test
    public void url_MakesNewRequest() {
        URL url = new URL("https://www.example.com");
        Connection connection = HttpConnection.url(url);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}