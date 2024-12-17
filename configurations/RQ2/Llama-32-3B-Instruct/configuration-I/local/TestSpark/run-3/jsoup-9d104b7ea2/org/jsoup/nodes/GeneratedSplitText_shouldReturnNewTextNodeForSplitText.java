package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSplitText_shouldReturnNewTextNodeForSplitText {

    @Test
    public void splitText_shouldReturnNewTextNodeForSplitText() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        int offset = 6;
        TextNode newNode = node.splitText(offset);
        assertEquals("World", newNode.text());
    }

}