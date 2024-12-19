package org.jsoup.helper;

public class GeneratedTestRequest {

    private Connection connection;
    private URL url;

    @Test
    public void testRequest() {
        request = new Request();
        connection = HttpConnection.newRequest(request);
        assertEquals(request, connection.getRequest());
    }

}