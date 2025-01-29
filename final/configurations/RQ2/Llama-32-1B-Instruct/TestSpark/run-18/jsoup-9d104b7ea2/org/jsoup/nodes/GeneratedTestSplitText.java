package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestSplitText {

    @Before
    void setup() {
        // Set up Document for each test case
    }

    @Test
    public void testSplitText() {
        String text = "Hello, World!";
        int length = ((TextNode) new TextNode(text)).splitText(text.length());
        assertEquals(7, length);
    }

}