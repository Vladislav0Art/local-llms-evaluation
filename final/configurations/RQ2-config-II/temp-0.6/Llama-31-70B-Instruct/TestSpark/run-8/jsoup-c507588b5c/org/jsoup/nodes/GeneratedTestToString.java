package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode textNode = new TextNode("This is a test");
        String expected = "This is a test";
        String actual = textNode.toString();
        assertEquals(expected, actual);
    }

}