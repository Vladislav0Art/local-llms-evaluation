package org.jsoup.nodes;

public class GeneratedConnection_SetConnection {

    @Test
    public void connection_SetConnection() {
        String url = "http://localhost:8080";
        Connection connection = Mockito.mock(Connection.class);
        Document document = new Document(url);
        document.connection(connection);
        assertEquals(connection, document.connection());
    }
}

}