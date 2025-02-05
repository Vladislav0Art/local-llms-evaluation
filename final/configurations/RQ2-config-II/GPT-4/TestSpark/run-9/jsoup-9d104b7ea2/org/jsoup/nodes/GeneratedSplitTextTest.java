package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Test text");
        TextNode splitNode = node.splitText(4);

        assertEquals("Test", node.getWholeText());
        assertEquals(" text", splitNode.getWholeText());
    }

}