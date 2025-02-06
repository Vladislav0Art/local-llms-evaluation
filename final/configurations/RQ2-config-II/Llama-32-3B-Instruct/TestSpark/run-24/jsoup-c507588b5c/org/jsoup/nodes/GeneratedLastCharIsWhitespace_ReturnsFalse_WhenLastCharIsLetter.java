package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_ReturnsFalse_WhenLastCharIsLetter {

    @Test
    public void lastCharIsWhitespace_ReturnsFalse_WhenLastCharIsLetter() {
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder("Hello A")));
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder("World B")));
    }

}