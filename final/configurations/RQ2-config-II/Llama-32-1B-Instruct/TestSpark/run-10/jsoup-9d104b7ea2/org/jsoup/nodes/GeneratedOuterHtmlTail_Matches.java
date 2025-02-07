package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTail_Matches {

    @Test
    public void outerHtmlTail_Matches() {
        // Create an instance of the class under test with a multi-line text
        TextNode node = new TextNode("<p>Hello, <span>World!</span></p>");

        // Assert that the outerHtmlTail method returns the expected value
        assertEquals("", node.outerHtmlTail("", 0, null));
    }

}