package org.jsoup.nodes;

public class GeneratedTestShallowCloneEmptyDocument {

    @Test
    public void testShallowCloneEmptyDocument() {
        Document document = new Document("");
        Document shallowClone = document.shallowClone();
        assertNotNull(shallowClone);
    }

}