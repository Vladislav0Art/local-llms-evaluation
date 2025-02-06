package org.jsoup.nodes;

public class GeneratedGetWholeText_NoChildNodesReturnsGivenText {

    @Test
    public void getWholeText_NoChildNodesReturnsGivenText() {
        TextNode node = new TextNode("test");
        assert "test".equals(node.getWholeText());
    }

}