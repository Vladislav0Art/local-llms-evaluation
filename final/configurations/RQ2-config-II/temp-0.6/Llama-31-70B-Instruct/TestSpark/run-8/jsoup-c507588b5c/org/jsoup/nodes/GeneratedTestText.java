package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode textNode = new TextNode("This is a test");
        String expected = "This is a test";
        String actual = textNode.text();
        assertEquals(expected, actual);
    }

}