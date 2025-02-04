package org.jsoup.nodes;

public class GeneratedNodeName ReturnsCorrectValue {

    @Test
    public void nodeName

    ReturnsCorrectValue() {
        // given
        TextNode textNode = new TextNode("Test Node");

        // when
        String nodeName = textNode.nodeName();

        // then
        assertEquals("#text", nodeName);
    }

}