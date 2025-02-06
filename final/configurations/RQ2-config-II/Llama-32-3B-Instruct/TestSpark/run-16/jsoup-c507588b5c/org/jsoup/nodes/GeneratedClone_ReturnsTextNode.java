package org.jsoup.nodes;

public class GeneratedClone_ReturnsTextNode {

    @Test
    public void clone_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.clone();
        assertNotNull(result.text());
        assertEquals(textNode.text(), result.text());
    }

}