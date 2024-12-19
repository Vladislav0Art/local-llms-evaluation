package org.jsoup.nodes;

public class GeneratedTextReturnsUnencodedText {

    private TextNode textNode;

    @Test
    public void textReturnsUnencodedText() {
        String originalText = "Hello World";
        textNode = new TextNode(originalText);
        assertEquals(originalText, textNode.text());
    }

}