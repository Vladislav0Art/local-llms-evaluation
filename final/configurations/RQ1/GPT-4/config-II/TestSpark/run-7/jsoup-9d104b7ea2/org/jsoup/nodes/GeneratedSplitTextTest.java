package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Testing");
        TextNode splitNode = node.splitText(4);
        assertNotNull(splitNode);
        assertEquals("Test", node.getWholeText());
        assertEquals("ing", splitNode.getWholeText());
    }

}