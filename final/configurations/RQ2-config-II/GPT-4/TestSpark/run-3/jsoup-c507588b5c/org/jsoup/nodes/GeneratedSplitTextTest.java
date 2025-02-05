package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Split Text Node");
        TextNode splitNode = textNode.splitText(5);
        assertEquals("Split", textNode.text());
        assertEquals(" Text Node", splitNode.text());
    }

}