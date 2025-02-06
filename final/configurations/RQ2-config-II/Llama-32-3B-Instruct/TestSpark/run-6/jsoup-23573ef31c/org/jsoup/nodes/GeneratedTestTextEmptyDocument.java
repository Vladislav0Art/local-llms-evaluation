package org.jsoup.nodes;

public class GeneratedTestTextEmptyDocument {

    @Test
    public void testTextEmptyDocument() {
        Document document = new Document("");
        assertNull(document.text(""));
    }

}