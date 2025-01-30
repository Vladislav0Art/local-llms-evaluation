package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "test test";
        TextNode node = new TextNode(text);
        TextNode splitNode = node.splitText(4);
        assertEquals("test", node.getWholeText());
        assertEquals(" test", splitNode.getWholeText());
    }

}