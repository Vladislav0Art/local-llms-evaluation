package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetWholeText {

    @Before
    void setup() {
        // Set up Document for each test case
    }

    @Test
    public void testGetWholeText() {
        String text = "Hello, World!";
        String actual = ((TextNode) new TextNode(text)).getWholeText();
        assertEquals(text, actual);
    }

}