package org.jsoup.nodes;

public class GeneratedNodeName_IsNotNullAndEqualToText {

    @Test
    public void nodeName_IsNotNullAndEqualToText() {
        String text = "text";
        TextNode textNode = new TextNode(text);
        assertEquals("#text", textNode.nodeName());
    }

}