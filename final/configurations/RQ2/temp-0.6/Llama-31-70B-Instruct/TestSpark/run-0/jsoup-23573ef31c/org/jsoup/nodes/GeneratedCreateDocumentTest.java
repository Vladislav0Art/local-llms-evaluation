package org.jsoup.nodes;

public class GeneratedCreateDocumentTest {

    private Document document;

    @Test
    public void createDocumentTest() {
        document = new Document("http://www.example.com");
        assertNotNull(document);
    }

}