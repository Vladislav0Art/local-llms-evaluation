package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitTextOffsetNonZero {

    @Test
    public void splitTextOffsetNonZero() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(1);
        assertNotNull(result);
        assertEquals("est", result.text());
    }

}