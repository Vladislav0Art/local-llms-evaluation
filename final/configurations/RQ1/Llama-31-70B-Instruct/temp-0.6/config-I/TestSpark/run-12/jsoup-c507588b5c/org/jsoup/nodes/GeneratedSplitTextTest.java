package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("This is a text node");
        TextNode splitNode = node.splitText(5);
        assertEquals("This ", node.getWholeText());
        assertEquals("is a text node", splitNode.getWholeText());
    }

}