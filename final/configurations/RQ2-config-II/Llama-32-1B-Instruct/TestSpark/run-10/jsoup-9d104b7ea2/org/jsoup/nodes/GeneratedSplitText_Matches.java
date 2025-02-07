package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitText_Matches {

    @Test
    public void splitText_Matches() {
        // Create an instance of the class under test with a multi-line text
        TextNode node = new TextNode("Hello, \nWorld!\n");

        // Assert that the splitText method returns the expected value
        String[] result = (String[]) node.splitText(0);
        assertEquals("Hello, World!", result[0]);
    }

}