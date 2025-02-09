package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedSplitText_WithOffsetGreaterThanOrEqualLength_ReturnsSameTextNode {

    @Test
    public void splitText_WithOffsetGreaterThanOrEqualLength_ReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        int offset = 10;
        TextNode result = textNode.splitText(offset);
        assertEquals(textNode, result);
    }

}