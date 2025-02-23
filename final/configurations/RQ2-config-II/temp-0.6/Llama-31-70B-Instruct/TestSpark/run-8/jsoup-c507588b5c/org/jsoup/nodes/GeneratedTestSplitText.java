package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("This is a test");
        TextNode actual = textNode.splitText(1);
        assertEquals("T", textNode.getWholeText());
        assertEquals("his is a test", actual.getWholeText());
    }

}