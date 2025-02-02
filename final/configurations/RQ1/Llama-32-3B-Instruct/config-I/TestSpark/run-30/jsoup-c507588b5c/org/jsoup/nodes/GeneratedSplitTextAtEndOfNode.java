package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.io.IOException;

public class GeneratedSplitTextAtEndOfNode {

    @Test
    public void splitTextAtEndOfNode() throws IOException {
        TextNode node = new TextNode("This is a test");
        TextNode splitNode = node.splitText(node.text().length());
        assertNotNull(splitNode);
        assertEquals("#text", splitNode.nodeName());
        assertEquals("", splitNode.getWholeText());
    }

}