package org.jsoup.nodes;

public class GeneratedTextNodeSplitTest_splitAtOffset_test {

    @Test
    public void textNodeSplitTest_splitAtOffset_test() throws IOException {
        final TextNode node = new TextNode("Hello World");
        final TextNode tailNode = node.splitText(6);
        Assert.assertEquals("Hello ", node.text());
        Assert.assertEquals("World", tailNode.text());
    }

}