package org.jsoup.nodes;

public class GeneratedTestFormsEmptyDocument {

    @Test
    public void testFormsEmptyDocument() {
        Document document = new Document("");
        assertEquals(0, document.forms().size());
    }

}