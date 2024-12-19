package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespaceReturnsCorrectValue {

    private TextNode textNode;

    @Test
    public void stripLeadingWhitespaceReturnsCorrectValue() {
        String originalText = "^\\s+Hello World";
        assertEquals("Hello World", TextNode.stripLeadingWhitespace(originalText));
    }

}