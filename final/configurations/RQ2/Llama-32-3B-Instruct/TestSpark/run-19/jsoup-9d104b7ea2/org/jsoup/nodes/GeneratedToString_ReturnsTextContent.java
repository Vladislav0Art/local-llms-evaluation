package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedToString_ReturnsTextContent {

    @Test
    public void toString_ReturnsTextContent() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.toString());
    }

}