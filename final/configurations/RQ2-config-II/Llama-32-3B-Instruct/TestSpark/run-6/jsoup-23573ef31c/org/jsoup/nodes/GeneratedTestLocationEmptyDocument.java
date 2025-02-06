package org.jsoup.nodes;

public class GeneratedTestLocationEmptyDocument {

    @Test
    public void testLocationEmptyDocument() {
        Document document = new Document("");
        assertEquals("", document.location());
    }

}