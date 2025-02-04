package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedSplitText_ValidOffsetTest {

    private void setup() {
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
    }

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void splitText_ValidOffsetTest() {
        TextNode node = createTextNode("Hello World");
        TextNode child1 = node.splitText(0);
        TextNode child2 = node.splitText(6);
        assertEquals("Hello", child1.text());
        assertEquals("World", child2.text());
    }

}