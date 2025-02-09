package org.jsoup.nodes;

public class GeneratedNodeName_TextNodeValue {

    @Test
    public void nodeName_TextNodeValue() {
        TextNode node = new TextNode("Hello");
        assertEquals("text", node.nodeName());
    }

}