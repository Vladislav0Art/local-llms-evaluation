package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedSplitText_GivenInvalidOffset_ThrowsIOException {

    @Test
    public void splitText_GivenInvalidOffset_ThrowsIOException() {
        String text = "";
        TextNode textNode = new TextNode(text);
        int offset = -1;
        try {
            textNode.splitText(offset);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals(0, e.getMessage().length());
        }
    }

}