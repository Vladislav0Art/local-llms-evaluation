package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.io.IOException;

public class GeneratedSplitTextAtMiddleOfNode {

    @Test
    public void splitTextAtMiddleOfNode() throws IOException {
        TextNode node = new TextNode("This is a test");
        TextNode splitNode1 = node.splitText(5);
        TextNode splitNode2 = node.splitText(10);
        assertNotNull(splitNode1);
        assertNotNull(splitNode2);
        assertEquals("#text", splitNode1.nodeName());
        assertEquals(node.text(), splitNode1.getWholeText());
        assertEquals("#text", splitNode2.nodeName());
        assertEquals("is a", splitNode2.getWholeText());
    }

}