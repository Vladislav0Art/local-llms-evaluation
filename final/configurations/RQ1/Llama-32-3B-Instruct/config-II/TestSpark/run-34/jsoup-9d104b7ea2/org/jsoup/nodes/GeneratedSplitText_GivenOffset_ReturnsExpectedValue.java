package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class GeneratedSplitText_GivenOffset_ReturnsExpectedValue {

    @Test
    public void splitText_GivenOffset_ReturnsExpectedValue() {
        String text = "Hello World";
        int offset = 6;
        TextNode textNode = new TextNode(text);
        TextNode expected = new TextNode("World");
        assertEquals(expected, textNode.splitText(offset));
    }

}