package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespace_Matches {

    @Test
    public void lastCharIsWhitespace_Matches() {
        // Create an instance of the class under test with a multi-line text containing whitespace characters after the last character
        TextNode node = new TextNode("<p>Hello <span>World!</span></p>");

        // Assert that the lastCharIsWhitespace method returns the expected value
        assertTrue(node.lastCharIsWhitespace(new StringBuilder()));
    }

}