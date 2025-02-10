package org.jsoup.helper;

public class GeneratedConnect_WithUrl_MakesNewRequest {

    @Test
    public void connect_WithUrl_MakesNewRequest() {
        URL url = new URL("https://www.example.com");
        Connection connection = HttpConnection.connect(url);
        assertEquals(Connection.class, connection.getClass());
    }

}