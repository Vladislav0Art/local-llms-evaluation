package org.jsoup.nodes;

public class GeneratedTestConnection {

    @Test
    public void testConnection() {
        Connection connection = new Connection("https://example.com");
        Document document = new Document(connection);
        assertEquals(document, document.connection());
    }

}