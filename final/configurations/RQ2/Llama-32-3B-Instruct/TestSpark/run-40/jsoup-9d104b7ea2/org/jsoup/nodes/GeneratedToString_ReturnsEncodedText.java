package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedToString_ReturnsEncodedText {

    @Test
    public void toString_ReturnsEncodedText() {
        String encodedText = "text";
        TextNode node = new TextNode(encodedText);
        assertEquals("text", node.toString());
    }

}