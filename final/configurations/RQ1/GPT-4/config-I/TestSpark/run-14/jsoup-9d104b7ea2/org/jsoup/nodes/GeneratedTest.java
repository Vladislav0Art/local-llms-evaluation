package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        TextNode node = new TextNode("Test");
        assertEquals("Test", node.getWholeText());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("Test");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode(" Test ");
        assertEquals("Test", node.text());
        node.text("New Text");
        assertEquals("New Text", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("Test");
        assertEquals("Test", node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode(" ");
        assertTrue(node.isBlank());
        node.text("Test");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode node = new TextNode("Test");
        node.splitText(-1);
    }

    @Test
    public void splitTextOverflowOffsetTest() {
        TextNode node = new TextNode("Test");
        node.splitText(5);
    }

    @Test
    public void splitTextMiddleOffsetTest() {
        TextNode node = new TextNode("Test");
        TextNode tailNode = node.splitText(2);
        assertEquals("Te", node.getWholeText());
        assertEquals("st", tailNode.getWholeText());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test");
        TextNode cloneNode = node.clone();
        assertEquals(node.getWholeText(), cloneNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("&lt;");
        assertEquals("<", node.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String normalizedStr = TextNode.normaliseWhitespace(" Test ");
        assertEquals("Test", normalizedStr);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String strippedStr = TextNode.stripLeadingWhitespace(" Test");
        assertEquals("Test", strippedStr);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Test ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        sb = new StringBuilder("Test");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}