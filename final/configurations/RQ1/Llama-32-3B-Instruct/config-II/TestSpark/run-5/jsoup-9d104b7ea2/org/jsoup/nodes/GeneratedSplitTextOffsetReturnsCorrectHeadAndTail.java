package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitTextOffsetReturnsCorrectHeadAndTail {

    @Test
    public void splitTextOffsetReturnsCorrectHeadAndTail() throws IOException {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        int offset = 6;
        TextNode head = node.splitText(offset).getWholeText();
        assertNotNull(head);
        String tail = node.getWholeText().substring(offset);
        assertNotNull(tail);
        assertEquals("World", tail);
    }

}