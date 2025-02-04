package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import java.io.ByteArrayOutputStream;

public class GeneratedNormaliseWhitespaceMethod_ReturnsCorrectlyNormalisedString {

    @Test
    public void normaliseWhitespaceMethod_ReturnsCorrectlyNormalisedString() {
        String text = "   Hello   World!";
        assertEquals("Hello World", TextNode.normaliseWhitespace(text));
    }

}