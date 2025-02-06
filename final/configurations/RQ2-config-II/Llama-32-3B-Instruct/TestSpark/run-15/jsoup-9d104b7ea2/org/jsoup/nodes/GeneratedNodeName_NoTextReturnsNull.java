package org.jsoup.nodes;

public class GeneratedNodeName_NoTextReturnsNull {

    @Test
    public void nodeName_NoTextReturnsNull() {
        TextNode node = new TextNode("");
        assert null == node.nodeName();
    }

}