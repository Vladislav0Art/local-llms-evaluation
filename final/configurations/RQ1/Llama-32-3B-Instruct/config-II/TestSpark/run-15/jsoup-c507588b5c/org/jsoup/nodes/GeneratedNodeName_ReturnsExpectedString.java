package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsExpectedString {

    @Test
    public void nodeName_ReturnsExpectedString() {
        // given
        TextNode textNode = new TextNode("Hello World");

        // when
        String nodeName = textNode.nodeName();

        // then
        assertEquals("#text", nodeName);
    }

}