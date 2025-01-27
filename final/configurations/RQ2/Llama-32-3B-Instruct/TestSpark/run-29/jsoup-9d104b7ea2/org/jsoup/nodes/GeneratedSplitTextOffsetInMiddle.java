package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedSplitTextOffsetInMiddle {

    @Test
    public void splitTextOffsetInMiddle() {
        String text = "Test";
        TextNode textNode = new TextNode(text);
        int offset = 3;
        TextNode result1 = textNode.splitText(offset);
        TextNode result2 = textNode.splitText(result1.length());
        assertEquals("Tes", result1.text());
        assertEquals("t", result2.text());
    }

}