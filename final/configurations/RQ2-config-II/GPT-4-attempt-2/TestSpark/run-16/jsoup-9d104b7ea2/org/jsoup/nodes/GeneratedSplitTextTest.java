package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Some text");
        TextNode splitNode = node.splitText(4);
        assertEquals(splitNode.text(), " text");
    }

}