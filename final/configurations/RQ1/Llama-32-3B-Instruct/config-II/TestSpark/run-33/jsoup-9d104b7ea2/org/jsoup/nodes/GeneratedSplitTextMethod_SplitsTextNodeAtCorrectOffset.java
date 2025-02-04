package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import java.io.ByteArrayOutputStream;

public class GeneratedSplitTextMethod_SplitsTextNodeAtCorrectOffset {

    @Test
    public void splitTextMethod_SplitsTextNodeAtCorrectOffset() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(6);
        assertEquals("World", result.text());
    }

}