package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("splitme");
        TextNode splitNode = node.splitText(4);

        assertEquals("split", node.getWholeText());
        assertEquals("me", splitNode.getWholeText());
    }

}