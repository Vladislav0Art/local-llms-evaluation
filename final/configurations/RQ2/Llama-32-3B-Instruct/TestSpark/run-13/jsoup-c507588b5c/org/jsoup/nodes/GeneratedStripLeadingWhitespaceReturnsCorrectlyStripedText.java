package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespaceReturnsCorrectlyStripedText {

    @Test
    public void stripLeadingWhitespaceReturnsCorrectlyStripedText() {
        // Given
        String text = "   Hello World   ";
        String expectedText = "Hello World";
        StringBuilder sb = new StringBuilder(text);

        // When
        String strippedText = TextNode.stripLeadingWhitespace(sb.toString());

        // Then
        assertEquals(expectedText, strippedText);
    }

}