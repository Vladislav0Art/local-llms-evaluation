package org.jsoup.nodes;

public class GeneratedTestHeadElement {

    @Test
    public void testHeadElement() throws Exception {
        String baseUri = "https://example.com";
        Document document = createShell(baseUri);
        Element head = document.head();
        assertNotNull(head);
        assertEquals("html", head.nodeName());
    }

}