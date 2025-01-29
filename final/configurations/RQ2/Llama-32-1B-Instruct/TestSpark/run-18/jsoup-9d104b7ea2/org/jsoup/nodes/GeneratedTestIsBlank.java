package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestIsBlank {

    @Before
    void setup() {
        // Set up Document for each test case
    }

    @Test
    public void testIsBlank() {
        boolean expected = true;
        boolean actual = ((TextNode) new TextNode("").isBlank());
        assertEquals(expected, actual);
    }

}