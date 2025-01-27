package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedCreateFromEncoded_ParsesEncodedText {

    @Test
    public void createFromEncoded_ParsesEncodedText() {
        String encodedText = "HelloWorld";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("HelloWorld", node.text());
    }

}