package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedTest {

    private void setup() {
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
    }

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void CreateTextNode_SimpleTextTest() {
        setup();
        TextNode node = createTextNode("Hello World");
        String output = node.toString();
        assertEquals("<p>Hello World</p>", output);
    }

    @Test
    public void text_NodeSetTextTest() {
        TextNode node = createTextNode("Hello World");
        node.text("New Text");
        assertEquals("New Text", node.text());
    }

    @Test
    public void getWholeText_NoWhitespaceTest() {
        TextNode node = createTextNode("Hello World");
        String output = node.getWholeText();
        assertEquals("Hello World", output);
    }

    @Test
    public void getWholeText_WithWhitespaceTest() {
        TextNode node = createTextNode(" Hello World  ");
        String output = node.getWholeText();
        assertEquals(" Hello World  ", output);
    }

    @Test
    public void isBlank_NoWhitespaceTest() {
        TextNode node = createTextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlank_WithWhitespaceTest() {
        TextNode node = createTextNode("Hello World");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitText_ValidOffsetTest() {
        TextNode node = createTextNode("Hello World");
        TextNode child1 = node.splitText(0);
        TextNode child2 = node.splitText(6);
        assertEquals("Hello", child1.text());
        assertEquals("World", child2.text());
    }

    @Test
    public void splitText_InvalidOffsetTest() {
        TextNode node = createTextNode("Hello World");
        assertThrows(IndexOutOfBoundsException.class, () -> node.splitText(-1));
    }

}