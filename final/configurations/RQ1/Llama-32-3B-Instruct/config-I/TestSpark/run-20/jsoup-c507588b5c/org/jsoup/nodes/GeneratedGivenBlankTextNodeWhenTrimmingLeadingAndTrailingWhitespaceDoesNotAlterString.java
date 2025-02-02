package org.jsoup.nodes;

public class GeneratedGivenBlankTextNodeWhenTrimmingLeadingAndTrailingWhitespaceDoesNotAlterString {

    @Test
    public void givenBlankTextNodeWhenTrimmingLeadingAndTrailingWhitespaceDoesNotAlterString() {
        String expectedText = "   ";
        TextNode blankTextNode = new TextNode(expectedText);
        boolean result = lastCharIsWhitespace(blankTextNode.text());
        assertTrue(result);
    }

}