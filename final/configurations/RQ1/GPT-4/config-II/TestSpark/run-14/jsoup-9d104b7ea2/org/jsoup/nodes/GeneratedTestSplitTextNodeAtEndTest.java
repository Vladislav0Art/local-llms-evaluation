package org.jsoup.nodes;

import junit.framework.TestCase;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSplitTextNodeAtEndTest {

    @Test
    public void testSplitTextNodeAtEndTest() {
        TextNode textNode = new TextNode("Hello, world!");
        TextNode result = textNode.splitText(13);
        assertEquals("Hello, world!", textNode.text());
        assertEquals("", result.text());
    }

}