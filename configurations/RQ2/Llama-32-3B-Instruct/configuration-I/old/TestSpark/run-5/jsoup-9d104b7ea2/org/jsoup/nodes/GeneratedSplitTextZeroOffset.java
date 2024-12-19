package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedSplitTextZeroOffset {

    @Test
    public void splitTextZeroOffset() {
        TextNode textNode = new TextNode("Hello World");
        TextNode leftSibling = textNode.splitText(0);
        assertNotNull(leftSibling);
        assertTrue(leftSibling.text().equals("Hello"));
    }

}