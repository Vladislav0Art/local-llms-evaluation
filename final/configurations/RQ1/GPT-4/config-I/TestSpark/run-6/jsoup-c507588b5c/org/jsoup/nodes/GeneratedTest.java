package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void textNodeCreationTest() {
        TextNode node = new TextNode("Some text");
        assertEquals("Some text", node.getWholeText());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("Some text");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode("   Some text    ");
        assertEquals("Some text", node.text());
    }

    @Test
    public void setTextTest() {
        TextNode node = new TextNode("Some text");
        node.text("Another text");
        assertEquals("Another text", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("   Some text    ");
        assertEquals("   Some text    ", node.getWholeText());
    }

    @Test
    public void isBlankTest_whenBlank() {
        TextNode node = new TextNode("    ");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlankTest_whenNotBlank() {
        TextNode node = new TextNode("Some text");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Hello, world");
        TextNode newNode = node.splitText(7);
        assertEquals("Hello, ", node.getWholeText());
        assertEquals("world", newNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("Text with &amp;amp; encoded character");
        assertEquals("Text with & encoded character", node.getWholeText());
    }

    @Test
    public void cloneNodeTest() {
        TextNode node = new TextNode("Some text");
        TextNode cloneNode = node.clone();
        assertNotEquals(node, cloneNode);
        assertEquals(node.getWholeText(), cloneNode.getWholeText());
    }

}