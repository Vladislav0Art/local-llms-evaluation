package org.jsoup.nodes;

public class GeneratedTestCloneEmptyDocument {

    @Test
    public void testCloneEmptyDocument() {
        Document document = new Document("");
        Document clone = document.clone();
        assertNotNull(clone);
    }

}