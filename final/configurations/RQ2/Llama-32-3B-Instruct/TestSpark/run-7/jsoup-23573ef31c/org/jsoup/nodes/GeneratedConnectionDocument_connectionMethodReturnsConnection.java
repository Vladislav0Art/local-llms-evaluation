package org.jsoup.nodes;

public class GeneratedConnectionDocument_connectionMethodReturnsConnection {

    @Test
    public void connectionDocument_connectionMethodReturnsConnection() {
        Connection connection = mock(Connection.class);
        when(connection.toString()).thenReturn("https://example.com");
        Document document = new Document("");
        assertEquals(connection, document.connection());
    }

}