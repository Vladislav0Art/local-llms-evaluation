package org.jsoup.nodes;

public class GeneratedNodeNameIsTextNode {

    @Test
    public void nodeNameIsTextNode() {
        TextNode node = new MockTextNode("text");
        assertEquals("text_node", node.nodeName());
    }

}