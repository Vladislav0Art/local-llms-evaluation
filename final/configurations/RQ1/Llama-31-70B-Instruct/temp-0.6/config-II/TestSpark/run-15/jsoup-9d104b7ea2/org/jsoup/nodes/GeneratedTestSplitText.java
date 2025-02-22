package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Test text");
        TextNode tailNode = node.splitText(4);
        assertEquals("Test", node.coreValue());
        assertEquals(" text", tailNode.coreValue());
    }

}