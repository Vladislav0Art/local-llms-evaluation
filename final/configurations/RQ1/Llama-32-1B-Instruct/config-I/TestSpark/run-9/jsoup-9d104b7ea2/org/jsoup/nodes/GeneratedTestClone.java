package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode textNode = new TextNode("test");
        TextNode clonedTextNode = textNode.clone();
        assertEquals(textNode, clonedTextNode);
    }

}