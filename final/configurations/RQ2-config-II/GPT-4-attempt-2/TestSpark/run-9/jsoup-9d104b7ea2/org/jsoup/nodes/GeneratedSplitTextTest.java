package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("split this text");
        TextNode splitNode = node.splitText(5);
        assertEquals("split", node.text());
        assertEquals(" this text", splitNode.text());
    }

}