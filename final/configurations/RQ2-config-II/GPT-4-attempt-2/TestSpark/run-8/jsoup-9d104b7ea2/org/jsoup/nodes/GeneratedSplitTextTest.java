package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "Test text";
        int offset = 4;
        String expected = "Test";
        TextNode textNode = new TextNode(text);
        TextNode splitNode = textNode.splitText(offset);
        assertEquals(expected, splitNode.getWholeText());
    }

}