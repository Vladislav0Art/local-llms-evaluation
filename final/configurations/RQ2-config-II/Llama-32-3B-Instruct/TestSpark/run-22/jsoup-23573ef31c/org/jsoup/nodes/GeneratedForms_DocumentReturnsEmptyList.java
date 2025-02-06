package org.jsoup.nodes;

public class GeneratedForms_DocumentReturnsEmptyList {

    @Test
    public void forms_DocumentReturnsEmptyList() {
        Document document = new Document("https://example.com");
        assertTrue(document.forms().isEmpty());
    }

}