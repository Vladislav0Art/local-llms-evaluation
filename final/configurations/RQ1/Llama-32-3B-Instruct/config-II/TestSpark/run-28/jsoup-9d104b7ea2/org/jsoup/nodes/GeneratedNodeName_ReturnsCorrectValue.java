package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsCorrectValue {

    @Test
    public void nodeName_ReturnsCorrectValue() {
        // given
        TextNode textNode = new TextNode("Hello World");

        // when
        String nodeName = textNode.nodeName();

        // then
        assertEquals("#text", nodeName);
    }

}