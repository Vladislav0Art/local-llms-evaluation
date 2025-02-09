package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedNormaliseWhitespace_NormalisesWhitespaceInText {

    @Test
    public void normaliseWhitespace_NormalisesWhitespaceInText() {
        String text = "   ";
        String expected = "   ";
        assertEquals(expected, TextNode.normaliseWhitespace(text));
    }

}