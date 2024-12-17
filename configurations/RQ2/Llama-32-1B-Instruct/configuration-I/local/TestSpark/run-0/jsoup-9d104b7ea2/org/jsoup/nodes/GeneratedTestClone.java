package org.jsoup.nodes;

public class GeneratedTestClone {

    private String text;
    private Appendable output;

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = node1.clone();
        Assert.notNull(node1, "Expected a TextNode");
        Assert.notNull(node2, "Expected a TextNode");
        Assert.notSame(node1, node2);
    }

}