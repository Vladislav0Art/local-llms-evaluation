package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Test");
        TextNode splitNode = node.splitText(2);
        assertEquals("Te", node.getWholeText());
        assertEquals("st", splitNode.getWholeText());
    }

}