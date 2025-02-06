package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Collections;

public class GeneratedText_TextWithQuotes_ReturnsQuotedText {

    @Test
    public void text_TextWithQuotes_ReturnsQuotedText() {
        TextNode textNode = new TextNode("'a' 'b' 'c'");
        assertEquals("'a' 'b' 'c'", textNode.text());
    }

}