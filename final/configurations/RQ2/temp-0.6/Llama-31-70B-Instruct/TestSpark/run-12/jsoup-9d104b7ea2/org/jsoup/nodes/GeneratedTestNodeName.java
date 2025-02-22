package org.jsoup.nodes;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        TextNode node = new TextNode("text");
        Assert.assertEquals("#text", node.nodeName());
    }

}