package org.jsoup.nodes;

public class GeneratedGetWholeText_WithWhitespace_ReturnsWhitespaceNormalizedTextContent {

    @Test
    public void getWholeText_WithWhitespace_ReturnsWhitespaceNormalizedTextContent() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertEquals(" ", textNode.getWholeText());
    }

}