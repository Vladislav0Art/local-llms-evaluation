package org.jsoup.nodes;

public class GeneratedNewNodeName_nodeNameIsCorrect {

    @Test
    public void newNodeName_nodeNameIsCorrect() {
        TextNode textNode = new TextNode("text");
        assertEquals("text_node", textNode.nodeName());
    }

}