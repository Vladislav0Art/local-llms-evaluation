package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;div&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<div>", textNode.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("   Hello, World!   ");
        assertEquals("Hello, World!", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("   Hello, World!   ");
        assertEquals("   Hello, World!   ", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode tailNode = textNode.splitText(6);
        assertEquals("Hello,", textNode.text());
        assertEquals("World!", tailNode.text());
    }

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("Hello, World!");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, Document.OutputSettings.create());
        assertEquals("Hello, World!", accum.toString());
    }

}