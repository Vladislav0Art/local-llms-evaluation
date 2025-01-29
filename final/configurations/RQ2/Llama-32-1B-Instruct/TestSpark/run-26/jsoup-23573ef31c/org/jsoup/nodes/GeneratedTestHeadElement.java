package org.jsoup.nodes;

public class GeneratedTestHeadElement {

    @Test
    public void testHeadElement() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        Element head = document.head();
        assertNotNull(head);
        assertEquals("head", head.nodeName());
    }

}