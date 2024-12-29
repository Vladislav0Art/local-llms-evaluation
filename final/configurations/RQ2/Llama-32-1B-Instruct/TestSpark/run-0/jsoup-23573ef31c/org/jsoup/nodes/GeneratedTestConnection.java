package org.jsoup.nodes;

public class GeneratedTestConnection {

    @Test
    public void testConnection() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        assertNotNull(document.connection());
    }

}