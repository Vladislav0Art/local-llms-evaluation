package org.jsoup.nodes;

public class GeneratedTestConnectionReturnsCorrectConnection {

    @Test
    public void testConnectionReturnsCorrectConnection() {
        String baseUrl = "https://example.com";
        Connection connection = new Connection(baseUrl);
        Document document = new Document(baseUrl);
        assertNotNull(document.connection());
        assertEquals(connection, document.connection());
    }

}