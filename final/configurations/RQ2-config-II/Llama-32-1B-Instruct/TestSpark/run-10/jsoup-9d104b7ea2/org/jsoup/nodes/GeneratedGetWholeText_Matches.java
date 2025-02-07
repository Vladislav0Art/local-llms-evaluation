package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetWholeText_Matches {

    @Test
    public void getWholeText_Matches() {
        // Create an instance of the class under test with a single line of text
        TextNode node = new TextNode("Hello, World!");

        // Get a reference to the getWholeText method and assert that it returns the expected value
        String actualText = (String) node.getWholeText();
        assertEquals("Hello, World!", actualText);
    }

}