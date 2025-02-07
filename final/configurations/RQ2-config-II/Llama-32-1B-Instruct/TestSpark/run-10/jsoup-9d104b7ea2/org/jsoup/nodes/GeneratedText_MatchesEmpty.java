package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedText_MatchesEmpty {

    @Test
    public void text_MatchesEmpty() {
        // Create an instance of the class under test with empty text
        TextNode node = new TextNode("");

        // Get a reference to the text property and assert that it returns the expected value
        String actualText = (String) node.text();
        assertEquals("", actualText);
    }

}