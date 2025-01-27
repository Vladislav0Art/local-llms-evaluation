package org.jsoup.nodes;

public class GeneratedNodeName_EmptyText_ReturnsNull {

    @Test
    public void nodeName_EmptyText_ReturnsNull() {
        TextNode node = new TextNode("");
        assertEquals(null, node.nodeName());
    }

}