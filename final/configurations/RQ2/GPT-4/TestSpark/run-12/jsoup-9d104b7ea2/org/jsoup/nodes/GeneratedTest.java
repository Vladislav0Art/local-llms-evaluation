package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode node = new TextNode("sample text");
        assertEquals("sample text", node.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("sample text");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textSetterTest() {
        TextNode node = new TextNode("sample text");
        node.text("new text");
        assertEquals("new text", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("sample text");
        assertEquals("sample text", node.getWholeText());
    }

    @Test
    public void isBlankTrueTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlankFalseTest() {
        TextNode node = new TextNode("sample text");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("sample text");
        TextNode split = node.splitText(6);
        assertEquals("sample", node.text());
        assertEquals(" text", split.text());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("sample text");
        TextNode clone = node.clone();
        assertEquals(node.text(), clone.text());
    }

    @Test
    public void createFromEncodedTest() {
        String encoded = "sample text";
        TextNode node = TextNode.createFromEncoded(encoded);
        assertEquals("sample text", node.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = "   sample   text   ";
        text = TextNode.normaliseWhitespace(text);
        assertEquals(" sample text ", text);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "   sample text   ";
        text = TextNode.stripLeadingWhitespace(text);
        assertEquals("sample text   ", text);
    }

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        StringBuilder sb = new StringBuilder("sample text ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        StringBuilder sb = new StringBuilder("sample text");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("sample text");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("sample text", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode node = new TextNode("sample text");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertEquals("", accum.toString());
    }

}