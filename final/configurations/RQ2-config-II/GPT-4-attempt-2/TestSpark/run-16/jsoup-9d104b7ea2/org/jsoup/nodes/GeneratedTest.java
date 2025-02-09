package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void TextNodeNonEmptyStringTest() {
        String str = "Some text";
        TextNode node = new TextNode(str);
        assertEquals(node.text(), str);
    }

    @Test
    public void TextNodeEmptyStringTest() {
        String str = "";
        TextNode node = new TextNode(str);
        assertTrue(node.isBlank());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("Some text");
        assertEquals(node.nodeName(), "#text");
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode("A");
        assertEquals(node.text(), "A");
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("Some text");
        assertEquals(node.getWholeText(), "Some text");
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode(" ");
        assertTrue(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Some text");
        TextNode splitNode = node.splitText(4);
        assertEquals(splitNode.text(), " text");
    }

    @Test
    public void toStringTest() {
        TextNode node = new TextNode("Some text");
        assertEquals(node.toString(), "Some text");
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Some text");
        TextNode cloneNode = node.clone();
        assertEquals(cloneNode.text(), node.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("Some text", false);
        assertEquals(node.text(), "Some text");
    }

    @Test
    public void normalizeWhitespaceTest() {
        String str = "  Some   text  ";
        String normalized = TextNode.normaliseWhitespace(str);
        assertEquals(normalized, " Some text ");
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String str = "  Some text";
        String stripped = TextNode.stripLeadingWhitespace(str);
        assertEquals(stripped, "Some text");
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Some text ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("Some text");
        StringBuilder sb = new StringBuilder();
        node.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals(sb.toString(), "Some text");
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode node = new TextNode("Some text");
        StringBuilder sb = new StringBuilder();
        node.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertEquals(sb.toString(), "");
    }

}