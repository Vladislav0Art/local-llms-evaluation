package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello world!");
        TextNode splitTextNode = textNode.splitText(5);
        assertEquals("Hello", textNode.text());
        assertEquals(" world!", splitTextNode.text());
    }

}