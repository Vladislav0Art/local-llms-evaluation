package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Hello World");
        TextNode result1 = (TextNode) node.splitText(5);
        assertEquals("World", result1.text());
        assertEquals("Hello", ((TextNode) node).text());
    }

}