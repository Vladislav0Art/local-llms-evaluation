package org.jsoup.helper;

public class GeneratedUrl_WithString_MakesNewRequest {

    @Test
    public void url_WithString_MakesNewRequest() {
        String url = "https://www.example.com";
        Connection connection = HttpConnection.url(url);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}