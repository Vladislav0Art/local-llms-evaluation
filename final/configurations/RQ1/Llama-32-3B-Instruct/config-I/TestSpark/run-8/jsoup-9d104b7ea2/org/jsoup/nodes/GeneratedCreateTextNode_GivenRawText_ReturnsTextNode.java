package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenRawText_ReturnsTextNode {

    @Test
    public void createTextNode_GivenRawText_ReturnsTextNode() {
        TextNode textNode = new TextNode("raw text");
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
        assertEquals("raw text", textNode.text());
    }

}