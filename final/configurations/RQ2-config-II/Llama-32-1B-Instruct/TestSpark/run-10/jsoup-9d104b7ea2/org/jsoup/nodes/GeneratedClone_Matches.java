package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedClone_Matches {

    @Test
    public void clone_Matches() {
        // Create an instance of the class under test with a multi-line text
        TextNode node = new TextNode("<p>Hello, <span>World!</span></p>");

        // Get a reference to the clone method and assert that it returns the expected value
        TextNode actualClone = (TextNode) node.clone();
        assertEquals(node, actualClone);
    }

}