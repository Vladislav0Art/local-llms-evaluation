package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        // Create an instance of the TextNode class
        String text = "<p>Hello, World!</p>";
        TextNode node = new TextNode(text);
        assertEquals("<p>", node.outerHtmlHead(null, 0, null));
        assertEquals("</p>", node.outerHtmlTail(null, 0, null));
    }

}