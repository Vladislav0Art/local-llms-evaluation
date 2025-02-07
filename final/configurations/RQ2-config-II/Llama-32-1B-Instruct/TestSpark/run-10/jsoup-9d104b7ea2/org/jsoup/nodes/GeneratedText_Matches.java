package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedText_Matches {

    @Test
    public void text_Matches() {
        // Create an instance of the class under test
        TextNode node = new TextNode("Hello, World!");

        // Get a reference to the text property and assert that it returns the expected value
        String actualText = (String) node.text();
        assertEquals("Hello, World!", actualText);
    }

}