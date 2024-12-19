package org.jsoup.helper;

public class GeneratedTestResponse {

    private Connection connection;
    private URL url;

    @Test
    public void testResponse() {
        response = new org.jsoup.helper.Response();
        connection = HttpConnection.newRequest(response);
        assertEquals(response, connection.getResponse());
    }

}