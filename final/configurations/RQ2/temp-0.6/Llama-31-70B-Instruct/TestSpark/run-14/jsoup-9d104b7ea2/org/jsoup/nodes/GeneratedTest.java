package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = new TextNode("&lt;");
        assertEquals(textNode.text(), "<");
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("  ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("abcdef");
        TextNode splitNode = textNode.splitText(3);
        assertEquals(textNode.text(), "abc");
        assertEquals(splitNode.text(), "def");
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("abc  def");
        textNode.text("xyz");
        assertEquals(textNode.text(), "xyz");
    }

}