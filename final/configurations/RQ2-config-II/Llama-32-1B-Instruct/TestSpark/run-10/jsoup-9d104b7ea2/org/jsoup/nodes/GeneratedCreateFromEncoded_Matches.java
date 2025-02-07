package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncoded_Matches {

    @Test
    public void createFromEncoded_Matches() {
        // Create an instance of the class under test with an encoded text
        String encodedText = "<p>Hello, <span>World!</span></p>";

        // Assert that the createFromEncoded method returns the expected value
        TextNode actualClone = (TextNode) org.jsoup.nodes.TextNode.createFromEncoded(encodedText);
        assertEquals(node, actualClone);
    }

}