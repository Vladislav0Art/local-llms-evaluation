package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedSplitText_WithZeroOffset_ReturnsSameTextNode {

    @Test
    public void splitText_WithZeroOffset_ReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode result = textNode.splitText(0);
        assertEquals(textNode, result);
    }

}