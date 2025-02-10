package org.jsoup.helper;

public class GeneratedProxy_WithHostAndPort_MakesNewRequest {

    @Test
    public void proxy_WithHostAndPort_MakesNewRequest() {
        String host = "localhost";
        int port = 8080;
        Connection connection = HttpConnection.proxy(host, port);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}