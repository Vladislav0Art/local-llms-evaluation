package org.jsoup.nodes;

public class GeneratedGetWholeText_GivenTextNode_ReturnsTextNodeText {

    @Test
    public void getWholeText_GivenTextNode_ReturnsTextNodeText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.getWholeText());
    }

}