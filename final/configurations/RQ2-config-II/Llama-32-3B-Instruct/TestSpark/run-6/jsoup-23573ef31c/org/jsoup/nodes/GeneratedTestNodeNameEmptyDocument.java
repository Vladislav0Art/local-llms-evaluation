package org.jsoup.nodes;

public class GeneratedTestNodeNameEmptyDocument {

    @Test
    public void testNodeNameEmptyDocument() {
        Document document = new Document("");
        assertEquals("", document.nodeName());
    }

}