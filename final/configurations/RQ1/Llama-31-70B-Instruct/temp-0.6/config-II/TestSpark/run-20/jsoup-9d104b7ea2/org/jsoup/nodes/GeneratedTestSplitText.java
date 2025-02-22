package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("text");
        TextNode node2 = node.splitText(2);
        assertEquals("te", node.getWholeText());
        assertEquals("xt", node2.getWholeText());
    }

}