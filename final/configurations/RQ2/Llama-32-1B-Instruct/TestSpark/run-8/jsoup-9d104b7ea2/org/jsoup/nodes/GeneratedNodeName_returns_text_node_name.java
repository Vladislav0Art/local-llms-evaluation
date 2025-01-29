package org.jsoup.nodes;

public class GeneratedNodeName_returns_text_node_name {

    @Test
    public void nodeName_returns_text_node_name() {
        TextNode node = new TextNode("Hello World");
        assertEquals("text_node", node.nodeName());
    }

}