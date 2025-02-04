package org.jsoup.nodes;

public class GeneratedToString_ReturnsOuterHtml {

    @Test
    public void toString_ReturnsOuterHtml() throws IOException {
        // given
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");

        // when
        String outerHtml = textNode.toString();

        // then
        assertEquals("<p>Hello World</p>", outerHtml);
    }

}