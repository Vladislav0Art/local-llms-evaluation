package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespace_Matches {

    @Test
    public void normaliseWhitespace_Matches() {
        // Create an instance of the class under test with a multi-line text containing whitespace
        TextNode node = new TextNode("<p>Hello  World!</p>");

        // Assert that the normaliseWhitespace method returns the expected value
        String actualText = (String) node.normaliseWhitespace("");
        assertEquals("Hello World", actualText);
    }

}