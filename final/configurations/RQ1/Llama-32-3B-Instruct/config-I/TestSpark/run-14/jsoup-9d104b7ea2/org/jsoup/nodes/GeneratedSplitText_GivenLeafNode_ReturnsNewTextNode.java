package org.jsoup.nodes;

public class GeneratedSplitText_GivenLeafNode_ReturnsNewTextNode {

    @Test
    public void splitText_GivenLeafNode_ReturnsNewTextNode() throws IOException {
        String text = "Hello World";
        LeafNode leafNode = new LeafNode(text);
        int offset = 5;
        TextNode splitTextNode = (TextNode) leafNode.splitText(offset);
        Assert.assertEquals(10, splitTextNode.text().length());
    }
}

}