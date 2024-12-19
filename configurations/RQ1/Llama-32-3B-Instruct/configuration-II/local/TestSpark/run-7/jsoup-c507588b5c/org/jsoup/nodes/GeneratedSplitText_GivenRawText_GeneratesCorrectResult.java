package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_GivenRawText_GeneratesCorrectResult {

    @Test
    public void splitText_GivenRawText_GeneratesCorrectResult() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        int offset = 7;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals("World", tailNode.text());
    }

}