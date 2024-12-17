package org.jsoup.nodes;

public class GeneratedNodeNameReturnsExpectedValue {

    @Test
    public void nodeNameReturnsExpectedValue() {
        // given
        TextNode textNode = new TextNode("test");

        // when
        String nodeName = textNode.nodeName();

        // then
        assertEquals("text", nodeName);
    }

}