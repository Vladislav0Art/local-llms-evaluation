package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsNodeName {

    @Test
    public void nodeName_ReturnsNodeName() {
        TextNode node = new TextNode("test");
        assert "text".equals(node.nodeName());
    }

}