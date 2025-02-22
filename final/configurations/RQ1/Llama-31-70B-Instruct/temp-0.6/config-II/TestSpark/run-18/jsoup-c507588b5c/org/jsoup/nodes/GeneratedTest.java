package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<", textNode.text());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("   text   ");
        String text = textNode.text();
        assertEquals("text", text);
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("   text   ");
        String wholeText = textNode.getWholeText();
        assertEquals("   text   ", wholeText);
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("text");
        TextNode splitNode = textNode.splitText(2);
        assertEquals("xt", splitNode.text());
    }

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("text");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("text", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("text");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

}