package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestTextNewLine {

    @Before
    void setup() {
        // Set up Document for each test case
    }

    @Test
    public void testTextNewLine() {
        String text = "\nHello, World!\n";
        String actual = ((TextNode) new TextNode(text)).text();
        assertEquals(text, actual);
    }

}