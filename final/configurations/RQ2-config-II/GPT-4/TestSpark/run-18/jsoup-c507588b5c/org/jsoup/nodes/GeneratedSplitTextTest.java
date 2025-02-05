package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String sampleText = "sample text";
        TextNode node = new TextNode(sampleText);
        TextNode splitNode = node.splitText(7);
        assertEquals("sample", node.text());
        assertEquals(" text", splitNode.text());
    }

}