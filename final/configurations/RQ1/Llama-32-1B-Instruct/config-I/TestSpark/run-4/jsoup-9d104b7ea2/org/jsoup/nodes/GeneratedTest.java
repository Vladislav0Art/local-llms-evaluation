package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    public TextNode testBlank() {
        String text = "";
        return new TextNode(text);
    }

    public TextNode testNonBlank() {
        String text = "Hello, world!";
        return new TextNode(text);
    }

    @Test
    public void testSplitText_EmptyText() {
        TextNode node = new TextNode("");
        assertNotNull(node.splitText(0));
    }

    @Test
    public void testSplitText_SingleChar() {
        TextNode node = new TextNode("a");
        assertNotNull(node.splitText(1));
    }

    @Test
    public void testSplitText_SplitAtEndOfLine() {
        String text = "Hello, \n world!";
        TextNode node = new TextNode(text);
        assertNotNull(node.splitText(8)); // split at the newline character
    }

    @Test
    public void testSplitText_SplitAtStartOfLine() {
        String text = "This is a\ntest string.";
        TextNode node = new TextNode(text);
        assertNotNull(node.splitText(-1)); // split at the start of the line
    }

    @Test
    public void testSplitText_SplittingSameNode() {
        TextNode node = new TextNode("Hello, world!");
        String text = "Hello, \n world!";
        assertEquals(2, node.splitText(text.length()));
    }

    @Test
    public void testGetWholeText_NoNewlines() {
        TextNode node = new TextNode("Hello, world!");
        String text = node.getWholeText();
        assertEquals("Hello, world!", text);
    }

    @Test
    public void testGetWholeText_SingleChar() {
        TextNode node = new TextNode("a");
        String text = node.getWholeText();
        assertEquals("a", text);
    }

    @Test
    public void testIsBlank_NoNewlines() {
        TextNode node = new TextNode("Hello, world!");
        assertTrue(node.isBlank());
    }

    @Test
    public void testIsBlank_SingleChar() {
        TextNode node = new TextNode("a");
        assertTrue(node.isBlank());
    }

    @Test
    public void testGetWholeText_WithNewlines() {
        TextNode node = new TextNode("Hello, \n world!");
        String text = node.getWholeText();
        assertEquals("Hello,\nworld!", text);
    }

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello, world!");
        assertEquals("<text> Hello, world! </text>", node.toString());
    }

}