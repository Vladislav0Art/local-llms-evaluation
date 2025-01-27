package org.jsoup.nodes;

public class GeneratedNormaliseWhitespaceReturnsCorrectString {

    @Test
    public void normaliseWhitespaceReturnsCorrectString() {
        // Given: text with leading whitespace
        String text = "   Hello World";
        String result = TextNode.normaliseWhitespace(text);

        // When: result
        assertEquals(result, "Hello World");
    }

}