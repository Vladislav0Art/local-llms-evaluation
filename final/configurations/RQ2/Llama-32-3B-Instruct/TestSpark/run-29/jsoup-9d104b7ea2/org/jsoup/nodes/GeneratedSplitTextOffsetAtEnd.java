package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedSplitTextOffsetAtEnd {

    @Test
    public void splitTextOffsetAtEnd() {
        String text = "Test";
        TextNode textNode = new TextNode(text);
        TextNode result1 = textNode.splitText(0);
        TextNode result2 = textNode.splitText(result1.length());
        assertEquals("", result1.text());
        assertEquals(text, result2.text());
    }

}