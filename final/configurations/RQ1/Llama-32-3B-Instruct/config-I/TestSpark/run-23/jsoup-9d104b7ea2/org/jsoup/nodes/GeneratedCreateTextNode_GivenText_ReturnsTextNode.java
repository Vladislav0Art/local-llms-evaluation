package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenText_ReturnsTextNode {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals(text, textNode.text());
    }

}