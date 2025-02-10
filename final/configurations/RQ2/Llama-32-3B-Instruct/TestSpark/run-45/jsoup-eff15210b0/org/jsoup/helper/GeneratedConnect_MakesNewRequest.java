package org.jsoup.helper;

public class GeneratedConnect_MakesNewRequest {

    @Test
    public void connect_MakesNewRequest() {
        Connection connection = HttpConnection.connect("https://www.example.com");
        assertEquals(Connection.class, connection.getClass());
    }

}