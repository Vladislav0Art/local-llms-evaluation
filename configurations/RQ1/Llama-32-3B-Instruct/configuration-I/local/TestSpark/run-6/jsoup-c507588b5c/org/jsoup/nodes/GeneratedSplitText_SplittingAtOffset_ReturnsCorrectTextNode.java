package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedSplitText_SplittingAtOffset_ReturnsCorrectTextNode {

    @Test
    public void splitText_SplittingAtOffset_ReturnsCorrectTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode tailNode = textNode.splitText(6);
        assertEquals("World", tailNode.text());
    }

}