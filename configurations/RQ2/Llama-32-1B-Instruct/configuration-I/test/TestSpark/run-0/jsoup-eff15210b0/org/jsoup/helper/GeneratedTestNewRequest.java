package org.jsoup.helper;

public class GeneratedTestNewRequest {

    private Connection connection;
    private URL url;

    @Test
    public void testNewRequest() {
        connection = HttpConnection.newRequest(request);
        assertEquals("GET / HTTP/1.1", connection.getMethod().toString());
    }

}