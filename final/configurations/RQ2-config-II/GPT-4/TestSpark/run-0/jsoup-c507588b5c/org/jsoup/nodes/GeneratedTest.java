package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        TextNode textNode = new TextNode("Sample Text");
        assertEquals("Sample Text", textNode.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("");
        textNode.text("Sample Text");
        assertEquals("Sample Text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Sample Text");
        assertEquals("Sample Text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("Sample Text");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Sample Text");
        TextNode newText = textNode.splitText(6);
        assertEquals("Sample", textNode.text());
        assertEquals(" Text", newText.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Sample Text");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("Sample Text", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("Sample Text");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertEquals("", sb.toString());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Sample Text");
        TextNode cloneTextNode = textNode.clone();
        assertEquals("Sample Text", cloneTextNode.text());
        assertNotSame(textNode, cloneTextNode);
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Sample%20Text");
        assertEquals("Sample Text", textNode.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = TextNode.normaliseWhitespace("Sample   Text  ");
        assertEquals("Sample Text ", text);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = TextNode.stripLeadingWhitespace("   Sample Text");
        assertEquals("Sample Text", text);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Sample Text ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}