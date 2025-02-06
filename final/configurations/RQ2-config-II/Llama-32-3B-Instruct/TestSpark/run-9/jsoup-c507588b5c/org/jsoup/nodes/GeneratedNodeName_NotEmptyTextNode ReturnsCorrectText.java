package org.jsoup.nodes;

public class GeneratedNodeName_NotEmptyTextNode ReturnsCorrectText {

    @Test
    public void nodeName_NotEmptyTextNode

    ReturnsCorrectText() {
        TextNode textNode = new TextNode("Hello");
        assertEquals("Hello", textNode.nodeName());
    }

}