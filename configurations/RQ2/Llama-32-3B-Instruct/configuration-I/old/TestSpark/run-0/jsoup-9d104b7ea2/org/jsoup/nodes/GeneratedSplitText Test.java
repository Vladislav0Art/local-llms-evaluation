package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedSplitText Test {

    @Test
    public void splitText

    Test() {
        String text = "Hello\nWorld";
        int offset = 0;
        TextNode textNode = new TextNode(text);
        TextNode newNode = textNode.splitText(offset);
        assertEquals("Hello", newNode.text());
        assertEquals("World", textNode.text(offset + 5));
    }

}