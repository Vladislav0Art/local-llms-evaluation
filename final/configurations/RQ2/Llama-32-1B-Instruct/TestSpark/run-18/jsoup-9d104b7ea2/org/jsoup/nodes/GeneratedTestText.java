package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestText {

    @Before
    void setup() {
        // Set up Document for each test case
    }

    @Test
    public void testText() {
        String text = "Hello, World!";
        String actual = ((TextNode) new TextNode(text)).text();
        assertEquals(text, actual);
    }

}