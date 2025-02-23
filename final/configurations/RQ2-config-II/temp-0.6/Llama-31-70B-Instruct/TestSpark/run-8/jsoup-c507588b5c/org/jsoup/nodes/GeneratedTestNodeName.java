package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("");
        String expected = "#text";
        String actual = textNode.nodeName();
        assertEquals(expected, actual);
    }

}