package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlank_Matches {

    @Test
    public void isBlank_Matches() {
        // Create an instance of the class under test with a blank line of text
        TextNode node = new TextNode("");

        // Assert that the isBlank method returns the expected value
        assertTrue(node.isBlank());
    }

}