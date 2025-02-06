package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedSplitTextOffset {

    @Test
    public void splitTextOffset() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        String[] strings = textNode.splitText(6).splitText(-1).splitText(-1);
        assertEquals(Arrays.asList("Hello", originalText.substring(7)), strings[0].splitText(-1));
    }

}