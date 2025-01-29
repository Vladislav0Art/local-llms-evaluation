package org.jsoup.nodes;

public class GeneratedTestDocumentConstructor {

    @Test
    public void testDocumentConstructor() throws Exception {
        Document document = new Document("https://www.example.com");
        assertNotNull(document);
        assertEquals("https://www.example.com", document.location());
        assertNotEquals(null, document.connection());
    }

}