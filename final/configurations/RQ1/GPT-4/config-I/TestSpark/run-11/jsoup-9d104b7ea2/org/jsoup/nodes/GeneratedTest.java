package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertEquals(text, node.coreValue());
    }

    @Test
    public void nodeNameTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        String text = "  test  ";
        TextNode node = new TextNode(text);
        assertEquals("test", node.text());
    }

    @Test
    public void textSetterTest() {
        String text = "test";
        TextNode node = new TextNode("");
        node.text(text);
        assertEquals("test", node.text());
    }

    @Test
    public void getWholeTestTest() {
        String text = "test test";
        TextNode node = new TextNode(text);
        assertEquals(text, node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode nodeEmpty = new TextNode("");
        TextNode nodeWhiteSpace = new TextNode(" ");
        TextNode nodeText = new TextNode("test");

        assertTrue(nodeEmpty.isBlank());
        assertTrue(nodeWhiteSpace.isBlank());
        assertFalse(nodeText.isBlank());
    }

    @Test
    public void splitTextTest() {
        String text = "test test";
        TextNode node = new TextNode(text);
        TextNode splitNode = node.splitText(4);
        assertEquals("test", node.getWholeText());
        assertEquals(" test", splitNode.getWholeText());
    }

    @Test
    public void cloneTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        TextNode cloneNode = node.clone();
        assertNotSame(node, cloneNode);
        assertEquals(node.getWholeText(), cloneNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;div&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("<div>", node.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = " test   test ";
        String normalisedText = TextNode.normaliseWhitespace(text);
        assertEquals("test test", normalisedText);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = " test";
        String strippedText = TextNode.stripLeadingWhitespace(text);
        assertEquals("test", strippedText);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder whitespaceSb = new StringBuilder("test ");
        StringBuilder noWhitespaceSb = new StringBuilder("test");

        assertTrue(TextNode.lastCharIsWhitespace(whitespaceSb));
        assertFalse(TextNode.lastCharIsWhitespace(noWhitespaceSb));
    }

}