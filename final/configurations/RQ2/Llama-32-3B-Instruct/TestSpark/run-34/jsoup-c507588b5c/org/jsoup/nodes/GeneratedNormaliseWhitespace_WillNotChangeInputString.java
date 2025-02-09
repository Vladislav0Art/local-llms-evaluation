package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

public class GeneratedNormaliseWhitespace_WillNotChangeInputString {

    @Test
    public void normaliseWhitespace_WillNotChangeInputString() {
        String input = "   ";
        String expected = "   ";
        assertEquals(expected, TextNode.normaliseWhitespace(input));
    }

}