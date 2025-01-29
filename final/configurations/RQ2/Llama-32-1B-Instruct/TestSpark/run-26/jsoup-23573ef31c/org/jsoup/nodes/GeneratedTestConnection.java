package org.jsoup.nodes;

public class GeneratedTestConnection {

    @Test
    public void testConnection() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        Connection connection = document.connection();
        assertNotNull(connection);
        assertNotSame("", connection.getURI());
    }

}