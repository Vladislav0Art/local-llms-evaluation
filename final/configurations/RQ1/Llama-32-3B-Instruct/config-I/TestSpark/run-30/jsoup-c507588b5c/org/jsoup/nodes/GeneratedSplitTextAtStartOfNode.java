package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.io.IOException;

public class GeneratedSplitTextAtStartOfNode {

    @Test
    public void splitTextAtStartOfNode() throws IOException {
        TextNode node = new TextNode("This is a test");
        TextNode splitNode = node.splitText(0);
        assertNotNull(splitNode);
        assertEquals("#text", splitNode.nodeName());
        assertEquals(node.text(), splitNode.getWholeText());
    }

}