package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNormaliseWhitespace_ReturnsCorrectString {

    @Test
    public void normaliseWhitespace_ReturnsCorrectString() {
        String text = "   Hello World";
        assertTrue(TextNode.normaliseWhitespace(text).equals("Hello World"));
    }

}