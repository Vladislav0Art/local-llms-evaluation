package org.jsoup.nodes;

public class GeneratedDocumentHeadElementShouldBeCreated {

    @Test
    public void documentHeadElementShouldBeCreated() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        Element head = document.head();
        assertTrue(head != null);
        assertEquals("head", head.nodeName());
    }

}