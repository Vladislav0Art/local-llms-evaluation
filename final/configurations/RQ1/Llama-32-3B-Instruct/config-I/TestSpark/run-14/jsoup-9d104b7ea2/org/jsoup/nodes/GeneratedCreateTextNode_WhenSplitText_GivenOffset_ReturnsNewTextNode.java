package org.jsoup.nodes;

public class GeneratedCreateTextNode_WhenSplitText_GivenOffset_ReturnsNewTextNode {

    @Test
    public void createTextNode_WhenSplitText_GivenOffset_ReturnsNewTextNode() throws IOException {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        int offset = 5;
        TextNode splitTextNode = textNode.splitText(offset);
        Assert.assertEquals(10, splitTextNode.text().length());
    }

}