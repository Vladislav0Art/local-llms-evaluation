package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestNodeName {

    @Before
    void setup() {
        // Set up Document for each test case
    }

    @Test
    public void testNodeName() {
        String expected = "Hello, World!";
        String actual = ((TextNode) new TextNode(expected)).nodeName();
        assertEquals(expected, actual);
    }

}