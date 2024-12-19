package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_GivenInvalidOffset_ThrowsIOException {

    @Test
    public void splitText_GivenInvalidOffset_ThrowsIOException() {
        String text = "Hello, World!";
        int offset = -1;
        TextNode textNode = new TextNode(text);
        try {
            textNode.splitText(offset);
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }

}