package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespaceReturnsCorrectString {

    @Test
    public void stripLeadingWhitespaceReturnsCorrectString() {
        // Given: text with leading whitespace
        String text = "   Hello World";
        String result = TextNode.stripLeadingWhitespace(text);

        // When: result
        assertEquals(result, "Hello World");
    }

}