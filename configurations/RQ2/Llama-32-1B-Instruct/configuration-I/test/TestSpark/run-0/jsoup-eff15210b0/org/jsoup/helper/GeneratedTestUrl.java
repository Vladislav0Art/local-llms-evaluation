package org.jsoup.helper;

public class GeneratedTestUrl {

    private Connection connection;
    private URL url;

    @Test
    public void testUrl() {
        url = new URL("/path/to/resource");
        connection = HttpConnection.connect(url);
        assertEquals(url, connection.getUrl());
    }

}