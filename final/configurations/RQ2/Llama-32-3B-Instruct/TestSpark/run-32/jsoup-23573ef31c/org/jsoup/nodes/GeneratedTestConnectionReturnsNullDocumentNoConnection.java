package org.jsoup.nodes;

public class GeneratedTestConnectionReturnsNullDocumentNoConnection {

    @Test
    public void testConnectionReturnsNullDocumentNoConnection() {
        Document document = new Document("https://example.com");
        Connection connection = null;
        assertEquals(connection, document.connection());
    }

}