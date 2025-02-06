package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class GeneratedToString_methodTests {

    @Test
    public void toString_methodTests() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertEquals(text, node.toString());
    }

}