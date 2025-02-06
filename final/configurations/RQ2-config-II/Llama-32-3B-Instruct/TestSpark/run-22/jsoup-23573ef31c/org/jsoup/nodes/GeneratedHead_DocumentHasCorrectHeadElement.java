package org.jsoup.nodes;

public class GeneratedHead_DocumentHasCorrectHeadElement {

    @Test
    public void head_DocumentHasCorrectHeadElement() {
        Document document = new Document("https://example.com");
        Element head = document.head();
        assertNotNull(head);
    }

}