package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitTextOffsetReturnsCorrectTextNode {

    @Test
    public void splitTextOffsetReturnsCorrectTextNode() throws IOException {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        int offset = 6;
        TextNode result = node.splitText(offset);
        assertNotNull(result);
        assertEquals("World", result.getWholeText());
    }

}