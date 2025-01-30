package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextMiddleOffsetTest {

    @Test
    public void splitTextMiddleOffsetTest() {
        TextNode node = new TextNode("Test");
        TextNode tailNode = node.splitText(2);
        assertEquals("Te", node.getWholeText());
        assertEquals("st", tailNode.getWholeText());
    }

}