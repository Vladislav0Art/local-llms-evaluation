package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("split Text");
        TextNode splitNode = textNode.splitText(5);
        assertEquals("Text", splitNode.text());
        assertEquals("split ", textNode.text());
    }

}