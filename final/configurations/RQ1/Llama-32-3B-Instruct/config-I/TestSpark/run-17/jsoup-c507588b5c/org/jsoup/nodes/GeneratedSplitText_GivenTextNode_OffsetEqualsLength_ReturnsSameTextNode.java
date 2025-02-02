package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_GivenTextNode_OffsetEqualsLength_ReturnsSameTextNode {

    public String normaliseWhitespace(String input) {
        // implementation of StringUtil.normaliseWhitespace method
        return input.replaceAll("\\s+", " ");
    }

    @Test
    public void splitText_GivenTextNode_OffsetEqualsLength_ReturnsSameTextNode() throws IOException {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        int offset = text.length();
        TextNode result = textNode.splitText(offset);
        assertEquals(textNode, result);
    }

}