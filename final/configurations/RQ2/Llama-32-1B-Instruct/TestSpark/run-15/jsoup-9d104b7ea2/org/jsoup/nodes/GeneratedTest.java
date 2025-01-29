package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTest {

    public String createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testText() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello, World!", node.text());
    }

    @Test
    public void testTextConstructor() {
        TextNode node = new TextNode("Hello, World!");
        assertNotNull(node.text());
        assertEquals("Hello, World!", node.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("Hello, World!");
        String wholeText = node.getWholeText();
        assertNotNull(wholeText);
        assertEquals("Hello, World!", wholeText);
    }

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("Hello");
        assertTrue(node.isBlank());
        assertFalse(node.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Hello, World!");
        String wholeText = node.getWholeText();
        String[] parts = wholeText.split("");
        assertNotNull(parts);
        assertEquals(2, parts.length);
        assertTrue(parts[0].trim().isEmpty());
        assertTrue(parts[1].trim().isEmpty());
    }

    @Test
    public void testOuterHtmlHead() {
        TextNode node = new TextNode("Hello, World!");
        String html = node.outerHtml();
        assertNotNull(html);
    }

    @Test
    public void testOuterHtmlTail() {
        TextNode node = new TextNode("Hello, World!");
        String html = node.outerHtml();
        assertNotNull(html);
    }

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello, World!");
        String html = node.toString();
        assertNotNull(html);
    }

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello");
        TextNode node2 = node1.clone();
        assertEquals(node1, node2);
    }

    @Test
    public void testFromEncoded() {
        String encodedText = "Hello,&#64;World!&#39;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals("Hello,&#64;World!", node.text());
    }

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello");
        TextNode node2 = (TextNode) node1.clone();
        assertEquals(node1, node2);
    }

    @Test
    public void testFromEncoded() {
        String encodedText = "Hello,&#64;World!&#39;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node.text());
    }

    @Test
    public void testnodeName() {
        TextNode node = createTextNode("Hello, World!");
        assertEquals(TextNode.class.getName(), node.getClass().getSimpleName());
    }

    @Test
    public void testGetWholeText() {
        TextNode node = createTextNode("Hello, World!");
        String wholeText = node.getWholeText();
        assertNotNull(wholeText);
        assertEquals("Hello, World!", wholeText);
    }

    @Test
    public void testIsBlank() {
        TextNode node = createTextNode("Hello");
        assertTrue(node.isBlank());
        assertFalse(node.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode node = createTextNode("Hello, World!");
        String wholeText = node.getWholeText();
        String[] parts = wholeText.split("");
        assertNotNull(parts);
        assertEquals(2, parts.length);
        assertTrue(parts[0].trim().isEmpty());
        assertTrue(parts[1].trim().isEmpty());
    }

    @Test
    public void testOuterHtmlHead() {
        TextNode node = createTextNode("Hello, World!");
        String html = node.outerHtml();
        assertNotNull(html);
    }

    @Test
    public void testOuterHtmlTail() {
        TextNode node = createTextNode("Hello, World!");
        String html = node.outerHtml();
        assertNotNull(html);
    }

    @Test
    public void testToString() {
        TextNode node = createTextNode("Hello, World!");
        String html = node.toString();
        assertNotNull(html);
    }

}