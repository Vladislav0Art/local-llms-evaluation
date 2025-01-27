package org.jsoup.nodes;

public class GeneratedHeadElement_test {

    @Test
    public void headElement_test() {
        Document document = new Document("http://example.com");
        Element head = document.head();
        assertNotNull(head);
    }

}