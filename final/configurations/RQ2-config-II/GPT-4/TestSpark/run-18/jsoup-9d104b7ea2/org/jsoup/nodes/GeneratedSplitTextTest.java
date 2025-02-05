package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("test");
        TextNode secondNode = node.splitText(2);
        assertEquals("te", node.getWholeText());
        assertEquals("st", secondNode.getWholeText());
    }

}