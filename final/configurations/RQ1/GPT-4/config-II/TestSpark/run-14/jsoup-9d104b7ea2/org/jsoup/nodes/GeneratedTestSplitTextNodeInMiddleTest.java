package org.jsoup.nodes;

import junit.framework.TestCase;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSplitTextNodeInMiddleTest {

    @Test
    public void testSplitTextNodeInMiddleTest() {
        TextNode textNode = new TextNode("Hello, world!");
        TextNode result = textNode.splitText(7);
        assertEquals("Hello,", textNode.text());
        assertEquals(" world!", result.text());
    }

}