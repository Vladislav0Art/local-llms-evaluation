package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedText_GettingTextValue_ReturnsInputText {

    @Test
    public void text_GettingTextValue_ReturnsInputText() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.text());
    }

}