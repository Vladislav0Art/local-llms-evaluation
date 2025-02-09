package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = " \t Hello";
        assertEquals("Hello", TextNode.stripLeadingWhitespace(text));
    }

}