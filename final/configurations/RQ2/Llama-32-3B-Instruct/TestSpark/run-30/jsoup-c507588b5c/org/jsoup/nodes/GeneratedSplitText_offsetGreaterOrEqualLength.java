package org.jsoup.nodes;

public class GeneratedSplitText_offsetGreaterOrEqualLength {

    @Test
    public void splitText_offsetGreaterOrEqualLength() {
        TextNode node = new TextNode("text");
        TextNode result = node.splitText(1);
        Assert.assertEquals("t", result.text());
    }

}