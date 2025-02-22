package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("some text");
        TextNode splitNode = textNode.splitText(5);
        assertEquals("some", textNode.text());
        assertEquals(" text", splitNode.text());
    }

}