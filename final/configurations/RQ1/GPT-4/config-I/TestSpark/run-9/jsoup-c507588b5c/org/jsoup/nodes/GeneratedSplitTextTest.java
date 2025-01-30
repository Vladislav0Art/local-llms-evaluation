package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node1 = new TextNode("Test1Test2");

        TextNode node2 = node1.splitText(5);

        assertEquals("Test1", node1.getWholeText());
        assertEquals("Test2", node2.getWholeText());
    }

}