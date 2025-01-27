package org.jsoup.nodes;

public class GeneratedClone_test {

    @Test
    public void clone_test() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        Document clonedDocument = document.clone();
        assertNotNull(clonedDocument);
        assertEquals(baseUri, clonedDocument.location());
    }

}