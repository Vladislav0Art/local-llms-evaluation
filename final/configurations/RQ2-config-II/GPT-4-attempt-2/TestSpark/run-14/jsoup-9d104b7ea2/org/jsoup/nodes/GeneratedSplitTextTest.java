package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test text");
        TextNode splitTextNode = textNode.splitText(4);
        assertEquals("Test", textNode.text());
        assertEquals(" text", splitTextNode.text());
    }

}