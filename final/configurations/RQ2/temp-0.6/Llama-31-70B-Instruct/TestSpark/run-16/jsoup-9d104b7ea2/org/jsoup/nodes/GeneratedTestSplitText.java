package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("test");
        TextNode splitNode = node.splitText(2);
        assertEquals("te", node.text());
        assertEquals("st", splitNode.text());
    }

}