package org.jsoup.nodes;

public class GeneratedConnection_DocumentHasCorrectConnection {

    @Test
    public void connection_DocumentHasCorrectConnection() {
        Connection connection = mock(Connection.class);
        when(connection.getConnection()).thenReturn(true);
        Document document = new Document("https://example.com");
        assertEquals(connection, document.connection());
    }

}