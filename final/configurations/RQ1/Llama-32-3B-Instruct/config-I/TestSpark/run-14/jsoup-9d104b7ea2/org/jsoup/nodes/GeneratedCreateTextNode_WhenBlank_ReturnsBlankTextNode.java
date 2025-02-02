package org.jsoup.nodes;

public class GeneratedCreateTextNode_WhenBlank_ReturnsBlankTextNode {

    @Test
    public void createTextNode_WhenBlank_ReturnsBlankTextNode() {
        String text = "";
        TextNode textNode = new TextNode(text);
        Assert.assertTrue(textNode.isBlank());
    }

}