package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

public class GeneratedSplitText_offsetAtBeginning_test {

    @Test
    public void splitText_offsetAtBeginning_test() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        int offset = 0;
        TextNode result = textNode.splitText(offset);
        assertEquals("Hello", result.text());
        assertTrue(textNode.isBlank());
    }

}