package org.jsoup.nodes;

public class GeneratedSplitText_offsetLessThanLength {

    @Test
    public void splitText_offsetLessThanLength() {
        TextNode node = new TextNode("text");
        TextNode result = node.splitText(3);
        Assert.assertEquals("", result.text());
    }

}