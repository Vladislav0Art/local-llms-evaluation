package org.jsoup.nodes;

public class GeneratedGetWholeText_NoWhitespace_ReturnsTextContent {

    @Test
    public void getWholeText_NoWhitespace_ReturnsTextContent() {
        String text = "text";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}