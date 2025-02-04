package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSplitTextAtOffsetReturnsTextNodeWithCorrectSplittingText {

    @Test
    public void splitTextAtOffsetReturnsTextNodeWithCorrectSplittingText() {
        String text = "Hello World";
        int offset = 6;
        TextNode node = new TextNode(text);
        TextNode tailNode = node.splitText(offset);
        assertEquals("Hello ", node.text());
        assertEquals("World", tailNode.text());
    }

}