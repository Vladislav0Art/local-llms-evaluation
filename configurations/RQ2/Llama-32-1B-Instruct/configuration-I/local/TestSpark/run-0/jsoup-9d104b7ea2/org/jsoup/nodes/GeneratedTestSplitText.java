package org.jsoup.nodes;

public class GeneratedTestSplitText {

    private String text;
    private Appendable output;

    @Test
    public void testSplitText() {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = node1.splitText(6);
        Assert.notNull(node2, "Expected a TextNode");
        Assert.notNull(node1, "Expected a TextNode");
        Assert.notSame(node1, node2);
    }

}