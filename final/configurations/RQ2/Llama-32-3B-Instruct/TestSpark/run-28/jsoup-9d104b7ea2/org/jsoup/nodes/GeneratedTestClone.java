package org.jsoup.nodes;

public class GeneratedTestClone {

    private static final String DEFAULT = "DEFAULT";

    @Test
    public void testClone() {
        Document document = new Document();
        TextNode textNode = document.createTextNode("test");
        TextNode clonedTextNode = document.clone(textNode);
        assertNotNull(clonedTextNode);
    }

}