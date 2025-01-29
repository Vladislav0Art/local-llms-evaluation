package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        // Create an instance of the TextNode class
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("Hello, World!", node.splitText(6));
    }

}