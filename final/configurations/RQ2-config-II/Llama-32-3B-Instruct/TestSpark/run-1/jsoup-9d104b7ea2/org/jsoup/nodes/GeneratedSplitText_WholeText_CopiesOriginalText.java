package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Collections;

public class GeneratedSplitText_WholeText_CopiesOriginalText {

    @Test
    public void splitText_WholeText_CopiesOriginalText() {
        TextNode textNode = new TextNode("abcdefg");
        TextNode result = textNode.splitText(0);
        assertEquals("abcdefg", result.text());
    }

}