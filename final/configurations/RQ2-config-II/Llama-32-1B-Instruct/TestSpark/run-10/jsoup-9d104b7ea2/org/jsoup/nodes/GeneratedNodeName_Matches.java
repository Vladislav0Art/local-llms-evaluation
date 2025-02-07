package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeName_Matches {

    @Test
    public void nodeName_Matches() {
        // Create an instance of the class under test
        TextNode node = new TextNode("Hello, World!");

        // Assert that the nodeName method returns the expected value
        assertEquals("Text Node", node.nodeName());
    }

}