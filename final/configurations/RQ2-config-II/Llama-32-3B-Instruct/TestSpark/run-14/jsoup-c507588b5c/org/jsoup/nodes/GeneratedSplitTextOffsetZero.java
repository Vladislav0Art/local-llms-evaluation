package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitTextOffsetZero {

    @Test
    public void splitTextOffsetZero() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(0);
        assertNotNull(result);
        assertEquals("test", result.text());
    }

}