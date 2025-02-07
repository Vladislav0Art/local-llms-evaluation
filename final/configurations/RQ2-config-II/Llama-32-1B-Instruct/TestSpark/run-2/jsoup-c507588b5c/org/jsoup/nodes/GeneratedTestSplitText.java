package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Hello, world! Hello again.");
        assertEquals(5, node.splitText(7));
        assertEquals("", node.splitText(-1));
    }

}