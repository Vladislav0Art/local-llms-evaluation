package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("test");
        TextNode splitNode = node.splitText(2);

        assertEquals("te", node.getWholeText());
        assertEquals("st", splitNode.getWholeText());
    }

}