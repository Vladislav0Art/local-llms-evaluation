package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedText_GivenTextNode_ReturnsUnencodedText {

    public String normaliseWhitespace(String input) {
        // implementation of StringUtil.normaliseWhitespace method
        return input.replaceAll("\\s+", " ");
    }

    @Test
    public void text_GivenTextNode_ReturnsUnencodedText() throws IOException {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        textNode.text(out);
        assertEquals("Hello, World!", normaliseWhitespace(out.toString()));
    }

}