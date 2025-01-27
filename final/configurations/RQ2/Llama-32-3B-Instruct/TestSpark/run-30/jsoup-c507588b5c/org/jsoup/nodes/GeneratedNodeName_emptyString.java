package org.jsoup.nodes;

public class GeneratedNodeName_emptyString {

    @Test
    public void nodeName_emptyString() {
        TextNode node = new TextNode("");
        Assert.assertEquals("", node.nodeName());
    }

}