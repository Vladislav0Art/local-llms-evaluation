package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Test");
        TextNode secondNode = node.splitText(2);
        assertEquals("Te", node.getWholeText());
        assertEquals("st", secondNode.getWholeText());
    }

}