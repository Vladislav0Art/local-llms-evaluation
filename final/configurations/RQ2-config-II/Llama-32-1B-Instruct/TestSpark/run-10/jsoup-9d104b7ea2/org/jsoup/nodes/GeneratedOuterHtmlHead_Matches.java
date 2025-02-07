package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHead_Matches {

    @Test
    public void outerHtmlHead_Matches() {
        // Create an instance of the class under test with a multi-line text
        TextNode node = new TextNode("<p>Hello, <span>World!</span></p>");

        // Assert that the outerHtmlHead method returns the expected value
        assertEquals("<p>Hello, World!</p>", node.outerHtmlHead("", 0, null));
    }

}