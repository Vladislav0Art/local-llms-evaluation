package org.jsoup.helper;

public class GeneratedTestUrlWithQueryString {

    private Connection connection;
    private URL url;

    @Test
    public void testUrlWithQueryString() {
        url = new URL("/path/to/resource?param1=value1&param2=value2");
        connection = HttpConnection.connect(url);
        assertEquals(url, connection.getUrl());
    }

}