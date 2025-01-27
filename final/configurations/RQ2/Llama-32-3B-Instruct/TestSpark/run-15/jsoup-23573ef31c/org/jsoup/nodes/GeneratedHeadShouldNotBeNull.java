package org.jsoup.nodes;

public class GeneratedHeadShouldNotBeNull {

    @Test
    public void headShouldNotBeNull() {
        Document document = Document.createShell("https://example.com");
        Element head = document.head();
        assertNotNull(head);
    }

}