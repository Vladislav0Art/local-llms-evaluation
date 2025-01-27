package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespaceReturnsCorrectResult {

    @Test
    public void lastCharIsWhitespaceReturnsCorrectResult() {
        // Given: StringBuilder with last character as whitespace
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        boolean result = TextNode.lastCharIsWhitespace(sb);

        // When: result
        assertTrue(result);
    }

}