package org.jsoup.nodes;

public class GeneratedNodeName_NullText_ReturnsNull {

    @Test
    public void nodeName_NullText_ReturnsNull() {
        TextNode node = new TextNode(null);
        assertNull(node.nodeName());
    }

}