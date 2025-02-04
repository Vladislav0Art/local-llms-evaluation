package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSplitText_GivenInvalidOffset_ThrowsAssertionError {

    @Test
    public void splitText_GivenInvalidOffset_ThrowsAssertionError() {
        TextNode textNode = new TextNode("Hello World");
        int offset = -1;
        try {
            textNode.splitText(offset);
            fail("Expected AssertionError");
        } catch (AssertionError e) {
            assertEquals("Split offset must be not be negative", e.getMessage());
        }
    }

}