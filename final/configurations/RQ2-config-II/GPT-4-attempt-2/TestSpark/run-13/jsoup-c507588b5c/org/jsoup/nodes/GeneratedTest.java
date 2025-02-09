package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode node = new TextNode("Test");
        assertEquals("Test", node.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("Test");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textSetterAndGetterTest() {
        TextNode node = new TextNode("Test");
        node.text("NewTest");
        assertEquals("NewTest", node.text());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Test");
        TextNode secondNode = node.splitText(2);
        assertEquals("Te", node.getWholeText());
        assertEquals("st", secondNode.getWholeText());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("Test", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        TextNode node = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertEquals("", accum.toString()); // As it doesn't add anything
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test");
        TextNode copiedNode = node.clone();
        assertNotSame(node, copiedNode);
        assertEquals(node.text(), copiedNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("Test", false);
        assertEquals("Test", node.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String textWithWhiteSpaces = "Test     text";
        String normalisedText = TextNode.normaliseWhitespace(textWithWhiteSpaces);
        assertEquals("Test text", normalisedText);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String textWithWhiteSpaces = "   Test text";
        String stripedText = TextNode.stripLeadingWhitespace(textWithWhiteSpaces);
        assertEquals("Test text", stripedText);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder textWithWhitespaceAtEnd = new StringBuilder("Test text ");
        assertTrue(TextNode.lastCharIsWhitespace(textWithWhitespaceAtEnd));

        StringBuilder textWithoutWhitespaceAtEnd = new StringBuilder("Test text");
        assertFalse(TextNode.lastCharIsWhitespace(textWithoutWhitespaceAtEnd));
    }

}