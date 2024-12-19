package org.jsoup.nodes;

public class GeneratedGetWholeTextReturnsUnencodedText {

    private TextNode textNode;

    @Test
    public void getWholeTextReturnsUnencodedText() {
        String originalText = "Hello World";
        textNode = new TextNode(originalText);
        assertEquals(originalText, textNode.getWholeText());
    }

}