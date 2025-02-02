package org.jsoup.nodes;

public class GeneratedText_GetWholeText_ReturnsUnencodedText {

    private Document parentNode;
    private Document document;

    @Test
    public void text_GetWholeText_ReturnsUnencodedText() {
        parentNode = document;
        TextNode textNode = new TextNode("Hello World");
        textNode.parentNode = parentNode;
        assertEquals("Hello World", textNode.getWholeText());
    }

}