package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode textNode = new TextNode("Hello World");
        TextNode clonedTextNode = (TextNode) textNode.clone();
        assertEquals(textNode, clonedTextNode);
    }

}