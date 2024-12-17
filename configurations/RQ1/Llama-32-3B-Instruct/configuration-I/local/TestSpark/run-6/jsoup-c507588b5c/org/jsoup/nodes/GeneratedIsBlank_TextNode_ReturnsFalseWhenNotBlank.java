package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedIsBlank_TextNode_ReturnsFalseWhenNotBlank {

    @Test
    public void isBlank_TextNode_ReturnsFalseWhenNotBlank() {
        TextNode textNode = new TextNode("Hello");
        assertFalse(textNode.isBlank());
    }

}