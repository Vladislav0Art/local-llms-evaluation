package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class GeneratedText_GivenText_ReturnsUnencodedText {

    @Test
    public void text_GivenText_ReturnsUnencodedText() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello", textNode.text());
    }

}