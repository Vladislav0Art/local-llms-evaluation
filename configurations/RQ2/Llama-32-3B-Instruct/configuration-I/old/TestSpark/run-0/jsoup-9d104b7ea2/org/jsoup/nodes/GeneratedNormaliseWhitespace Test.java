package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedNormaliseWhitespace Test {

    @Test
    public void normaliseWhitespace

    Test() {
        String text = "   Hello   ";
        String normalised = TextNode.normaliseWhitespace(text);
        assertEquals("Hello", normalised.trim());
    }

}