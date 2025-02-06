package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Collections;

public class GeneratedText_MultiCharText_ReturnsMultiCharText {

    @Test
    public void text_MultiCharText_ReturnsMultiCharText() {
        TextNode textNode = new TextNode("abcdefg");
        assertEquals("abcdefg", textNode.text());
    }

}