package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("splitText");
        TextNode splitNode = node.splitText(4);
        assertEquals("split", node.getWholeText());
        assertEquals("Text", splitNode.getWholeText());
    }

}