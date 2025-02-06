package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Collections;

public class GeneratedTextText_MultiCharText_ReturnsMultiCharText {

    @Test
    public void textText_MultiCharText_ReturnsMultiCharText() {
        TextNode textNode = new TextNode("abcdefg");
        assertEquals("abcdefg", textNode.textText());
    }

}