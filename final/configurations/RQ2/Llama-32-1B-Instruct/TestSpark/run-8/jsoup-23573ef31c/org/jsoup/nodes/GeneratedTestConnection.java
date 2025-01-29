package org.jsoup.nodes;

public class GeneratedTestConnection {

    @Test
    public void testConnection() throws Exception {
        String baseUri = "http://example.com";
        Connection connection = new Connection();
        Document document = new DocumentDocument(baseUri);
        assertEquals(connection, document.connection());
    }

}