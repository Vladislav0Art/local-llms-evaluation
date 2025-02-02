package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_GivenTextNode_OffsetIsLessThanLength_ReturnsNewTextNode {

    public String normaliseWhitespace(String input) {
        // implementation of StringUtil.normaliseWhitespace method
        return input.replaceAll("\\s+", " ");
    }

    @Test
    public void splitText_GivenTextNode_OffsetIsLessThanLength_ReturnsNewTextNode() throws IOException {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        int offset = 5;
        TextNode result = textNode.splitText(offset);
        assertNotNull(result);
        assertEquals("World", result.text());
    }

}