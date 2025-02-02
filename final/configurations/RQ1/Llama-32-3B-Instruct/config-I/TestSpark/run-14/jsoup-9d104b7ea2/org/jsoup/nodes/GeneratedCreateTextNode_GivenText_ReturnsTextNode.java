package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenText_ReturnsTextNode {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals("text", textNode.nodeName());
        Assert.assertEquals(text, textNode.text());
    }

}