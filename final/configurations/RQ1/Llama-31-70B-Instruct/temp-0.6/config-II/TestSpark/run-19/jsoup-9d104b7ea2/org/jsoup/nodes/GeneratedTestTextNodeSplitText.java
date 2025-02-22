package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeSplitText {

    @Test
    public void testTextNodeSplitText() {
        String text = "This is a test";
        TextNode textNode = new TextNode(text);
        TextNode splitTextNode = textNode.splitText(7);
        assertEquals("This is", textNode.text());
        assertEquals("a test", splitTextNode.text());
    }

}