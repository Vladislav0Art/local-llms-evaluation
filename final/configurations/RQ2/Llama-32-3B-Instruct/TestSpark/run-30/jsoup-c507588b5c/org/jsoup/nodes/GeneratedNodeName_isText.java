package org.jsoup.nodes;

public class GeneratedNodeName_isText {

    @Test
    public void nodeName_isText() {
        TextNode node = new TextNode("text");
        Assert.assertEquals("text", node.nodeName());
    }

}