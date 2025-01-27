package org.jsoup.nodes;

public class GeneratedConnection_ByDefaultConnection {

    @Test
    public void connection_ByDefaultConnection() {
        String url = "http://example.com";
        Connection connection = new Connection();
        Document document = new Document(url);
        document.connection(connection);
        assertEquals(connection, document.connection());
    }

}