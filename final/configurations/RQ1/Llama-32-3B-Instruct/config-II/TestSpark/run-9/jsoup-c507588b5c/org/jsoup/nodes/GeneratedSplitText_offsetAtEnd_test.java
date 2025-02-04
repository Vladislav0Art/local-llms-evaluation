package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

public class GeneratedSplitText_offsetAtEnd_test {

    @Test
    public void splitText_offsetAtEnd_test() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        int offset = 11; // 10 characters for "Hello" + null terminator
        TextNode result = textNode.splitText(offset);
        assertNotNull(result);
        assertEquals("", result.text());
    }

}