package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffset_ReturnsTextNode {

    @Test
    public void splitText_GivenOffset_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(5);
        assertNotNull(result.text());
        assertEquals("World", result.text());
    }

}