package org.jsoup.nodes;

public class GeneratedShallowClone_test {

    @Test
    public void shallowClone_test() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        Document clonedDocument = document.shallowClone();
        assertNotNull(clonedDocument);
        assertEquals(baseUri, clonedDocument.location());
    }

}