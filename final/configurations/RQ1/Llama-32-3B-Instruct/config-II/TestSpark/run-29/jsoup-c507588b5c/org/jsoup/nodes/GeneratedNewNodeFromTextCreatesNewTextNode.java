package org.jsoup.nodes;

public class GeneratedNewNodeFromTextCreatesNewTextNode {

    @Test
    public void newNodeFromTextCreatesNewTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
    }

}