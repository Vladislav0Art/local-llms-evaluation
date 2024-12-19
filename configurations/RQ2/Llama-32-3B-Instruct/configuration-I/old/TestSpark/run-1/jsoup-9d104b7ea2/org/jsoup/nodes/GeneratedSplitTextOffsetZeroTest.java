package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;

public class GeneratedSplitTextOffsetZeroTest {

    @Test
    public void splitTextOffsetZeroTest() {
        TextNode node = new TextNode("Hello World");
        assertEquals(node, node.splitText(0));
    }

}