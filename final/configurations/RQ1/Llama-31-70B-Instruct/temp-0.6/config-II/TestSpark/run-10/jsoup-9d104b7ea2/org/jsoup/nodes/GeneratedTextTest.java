package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("   Hello, World!   ");
        assertEquals("Hello, World!", textNode.text());
    }

}