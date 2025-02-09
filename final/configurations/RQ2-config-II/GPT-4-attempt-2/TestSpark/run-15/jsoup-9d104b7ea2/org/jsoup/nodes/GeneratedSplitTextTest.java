package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("TextToBeSplit");
        TextNode splitNode = node.splitText(4);
        assertEquals("Text", node.getWholeText());
        assertEquals("ToBeSplit", splitNode.getWholeText());
    }

}