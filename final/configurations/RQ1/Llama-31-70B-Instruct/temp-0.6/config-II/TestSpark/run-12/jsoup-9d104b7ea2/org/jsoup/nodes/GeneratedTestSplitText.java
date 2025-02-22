package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Some text");
        TextNode tailNode = node.splitText(5);
        assertEquals("Some ", node.getWholeText());
        assertEquals("text", tailNode.getWholeText());
    }

}