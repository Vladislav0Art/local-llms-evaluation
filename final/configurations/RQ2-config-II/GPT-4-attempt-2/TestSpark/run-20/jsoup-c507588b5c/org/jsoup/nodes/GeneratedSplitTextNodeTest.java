package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedSplitTextNodeTest {

    @Test
    public void splitTextNodeTest() {
        TextNode node = new TextNode("content");
        TextNode split = node.splitText(2);
        assertEquals("ntent", split.text());
        assertEquals("co", node.text());
    }

}