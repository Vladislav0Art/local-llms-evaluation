package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedIsBlank_TextNode_ReturnsTrueWhenBlank {

    @Test
    public void isBlank_TextNode_ReturnsTrueWhenBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}