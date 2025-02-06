package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newNodeFromEncodedText() {
        String encodedText = "Hello, World!";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals(encodedText, textNode.text());
    }

    @Test
    public void createWholeText() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertEquals(text + text, textNode.getWholeText());
    }

    @Test
    public void isBlankText() {
        String text = " ";
        assertFalse(TextNode.isBlank(text));
        assertTrue(TextNode.isBlank(""));
    }

    @Test
    public void cloneTextNode() throws IOException {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(textNode.text(), clonedTextNode.text());
    }

    @Test
    public void splitTextOffset() throws IOException {
        String text = "Hello\nWorld!";
        TextNode textNode = new TextNode(text);
        int offset = 7;
        TextNode splitTextNode = textNode.splitText(offset);
        assertNotNull(splitTextNode);
        assertEquals(text, splitTextNode.text());
    }

    @Test
    public void outerHtmlHeadTextNode() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document document = Document.parse("<p>Hello</p>");
        Appendable accum = outContent;
        TextNode textNode = new TextNode("World!");
        document.outputSettings().setOutputMode(Document.OutputMode.html);
        document.outerHtmlHead(accum, 1, document.outputSettings());
        String htmlOut = outContent.toString();
        assertTrue(htmlOut.contains("<p>Hello</p>"));
    }

    @Test
    public void outerHtmlTailTextNode() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document document = Document.parse("<p>Hello</p>");
        Appendable accum = outContent;
        TextNode textNode = new TextNode("World!");
        document.outputSettings().setOutputMode(Document.OutputMode.html);
        document.outerHtmlTail(accum, 1, document.outputSettings());
        String htmlOut = outContent.toString();
        assertTrue(htmlOut.contains("<p>Hello</p>"));
    }

    @Test
    public void toStringTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("TextNode [text=Hello, World!]", textNode.toString());
    }

}