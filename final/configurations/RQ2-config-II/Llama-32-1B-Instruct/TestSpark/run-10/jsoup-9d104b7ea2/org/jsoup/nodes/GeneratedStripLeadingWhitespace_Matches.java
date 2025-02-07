package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespace_Matches {

    @Test
    public void stripLeadingWhitespace_Matches() {
        // Create an instance of the class under test with a multi-line text containing leading whitespace
        TextNode node = new TextNode("<p>Hello  World!</p>");

        // Assert that the stripLeadingWhitespace method returns the expected value
        String actualText = (String) node.stripLeadingWhitespace("");
        assertEquals("Hello World", actualText);
    }

}