package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedGetWholeText_TextNode_ReturnsUnencodedText {

    @Test
    public void getWholeText_TextNode_ReturnsUnencodedText() {
        TextNode textNode = new TextNode("Hello World");
        String wholeText = textNode.getWholeText();
        assertEquals("Hello World", wholeText);
    }

}