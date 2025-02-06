package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedStripLeadingWhitespace_ReturnsCorrectString {

    @Test
    public void stripLeadingWhitespace_ReturnsCorrectString() {
        String text = "   Hello World";
        assertEquals("Hello World", TextNode.stripLeadingWhitespace(text));
    }

}