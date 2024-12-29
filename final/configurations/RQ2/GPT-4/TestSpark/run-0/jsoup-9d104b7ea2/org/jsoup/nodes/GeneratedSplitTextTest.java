package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Test Text");
        TextNode splitNode = node.splitText(4);
        assertEquals("Test", node.getWholeText());
        assertEquals(" Text", splitNode.getWholeText());
    }

}