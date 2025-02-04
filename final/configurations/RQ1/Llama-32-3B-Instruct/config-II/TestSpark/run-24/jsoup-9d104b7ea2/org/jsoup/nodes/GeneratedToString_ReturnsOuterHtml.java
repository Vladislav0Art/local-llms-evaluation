package org.jsoup.nodes;

public class GeneratedToString_ReturnsOuterHtml {

    @Test
    public void toString_ReturnsOuterHtml() {
        // given
        TextNode textNode = new TextNode("Hello World");

        // when
        String outerHtml = textNode.toString();

        // then
        assertEquals(outerHtml, "Hello World");
    }

}