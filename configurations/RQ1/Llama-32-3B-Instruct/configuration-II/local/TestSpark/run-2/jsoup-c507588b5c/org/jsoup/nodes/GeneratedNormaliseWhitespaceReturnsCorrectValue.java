package org.jsoup.nodes;

public class GeneratedNormaliseWhitespaceReturnsCorrectValue {

    private TextNode textNode;

    @Test
    public void normaliseWhitespaceReturnsCorrectValue() {
        String originalText = "   Hello World";
        assertEquals("Hello World", TextNode.normaliseWhitespace(originalText));
    }

}