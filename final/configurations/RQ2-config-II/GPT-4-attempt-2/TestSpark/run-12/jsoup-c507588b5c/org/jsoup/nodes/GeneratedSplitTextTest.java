package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("hello");
        TextNode secondPart = node.splitText(2);
        assertEquals("hel", node.getWholeText());
        assertEquals("lo", secondPart.getWholeText());
    }

}