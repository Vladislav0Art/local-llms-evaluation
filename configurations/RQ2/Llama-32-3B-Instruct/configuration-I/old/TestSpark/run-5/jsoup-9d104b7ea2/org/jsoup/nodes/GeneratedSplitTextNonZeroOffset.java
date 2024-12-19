package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedSplitTextNonZeroOffset {

    @Test
    public void splitTextNonZeroOffset() {
        TextNode textNode = new TextNode("Hello World");
        TextNode leftSibling = textNode.splitText(3);
        assertNotNull(leftSibling);
        assertTrue(leftSibling.text().equals("World"));
    }

}