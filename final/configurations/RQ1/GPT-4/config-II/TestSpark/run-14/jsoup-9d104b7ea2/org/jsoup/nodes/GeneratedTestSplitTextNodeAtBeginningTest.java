package org.jsoup.nodes;

import junit.framework.TestCase;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSplitTextNodeAtBeginningTest {

    @Test
    public void testSplitTextNodeAtBeginningTest() {
        TextNode textNode = new TextNode("Hello, world!");
        TextNode result = textNode.splitText(0);
        assertEquals("", textNode.text());
        assertEquals("Hello, world!", result.text());
    }

}