package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToString_Matches {

    @Test
    public void toString_Matches() {
        // Create an instance of the class under test with a multi-line text
        TextNode node = new TextNode("<p>Hello, <span>World!</span></p>");

        // Assert that the toString method returns the expected value
        String actualText = (String) node.toString();
        assertEquals("Hello, World!", actualText);
    }

}