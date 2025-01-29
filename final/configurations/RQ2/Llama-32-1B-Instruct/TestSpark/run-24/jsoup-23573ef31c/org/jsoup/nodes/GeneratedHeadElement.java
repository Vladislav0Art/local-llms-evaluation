package org.jsoup.nodes;

public class GeneratedHeadElement {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void headElement() throws Exception {
        Document doc = createDocument(BASE_URI);
        Element head = doc.head();
        assertNotNull(head);
        assertEquals("<head>", head.outerHtml());
    }

}