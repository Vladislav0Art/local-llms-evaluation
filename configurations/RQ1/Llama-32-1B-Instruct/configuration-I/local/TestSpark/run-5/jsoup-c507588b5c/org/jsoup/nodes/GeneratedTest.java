package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    public String normalizeWhitespace(String text) {
        return text.trim();
    }

    public StringBuilder stripLeadingWhitespace(StringBuilder sb) {
        if (sb == null || sb.length() == 0) {
            return new StringBuilder();
        }
        int index = sb.lastIndexOf(" ");
        return sb.substring(index + 1);
    }

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode(" ");
        assertTrue(node.isBlank());
    }

    @Test
    public void testIsBlank_1() {
        TextNode node = new TextNode("\n");
        assertTrue(node.isBlank());
    }

    @Test
    public void testIsBlank_2() {
        TextNode node = new TextNode("Hello World!");
        assertFalse(node.isBlank());
    }

    @Test
    public void testSplitText_1() {
        TextNode node = new TextNode("<p>Hello <span>World!</span></p>");
        TextNode result = node.splitText(2);
        assertNotNull(result);
        assertEquals(node, result);
    }

    @Test
    public void testSplitText_2() {
        TextNode node = new TextNode("Hello World!");
        TextNode result = node.splitText(3);
        assertNotNull(result);
        assertEquals(node, result);
    }

    @Test
    public void testSplitText_3() {
        TextNode node = new TextNode("<p>Hello <span>World!</span></p>");
        TextNode result = node.splitText(1);
        assertNotNull(result);
        assertEquals(node, result);
    }

    @Test
    public void testGetWholeText_2() {
        TextNode node = new TextNode("<p>Hello <span>World!</span></p>");
        assertEquals("", node.getWholeText());
    }

    @Test
    public void testIsBlank_3() {
        TextNode node = new TextNode("\n\n");
        assertTrue(node.isBlank());
    }

}