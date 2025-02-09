package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedSplitText_WithNonZeroOffset_ReturnsNewTextNode {

    @Test
    public void splitText_WithNonZeroOffset_ReturnsNewTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        String substring = "World!";
        TextNode result = textNode.splitText(substring.length());
        assertNotNull(result.text());
        assertTrue(result.text().equals(substring));
    }

}