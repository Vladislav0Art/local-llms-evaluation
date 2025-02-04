package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class GeneratedText_SplittingTextNode_atOffset_ReturnsExpectedValue {

    @Test
    public void text_SplittingTextNode_atOffset_ReturnsExpectedValue() {
        String text = "Hello World";
        int offset = 6;
        TextNode textNode = new TextNode(text);
        TextNode expected = new TextNode("World");
        assertEquals(expected, textNode.text(offset));
    }

}