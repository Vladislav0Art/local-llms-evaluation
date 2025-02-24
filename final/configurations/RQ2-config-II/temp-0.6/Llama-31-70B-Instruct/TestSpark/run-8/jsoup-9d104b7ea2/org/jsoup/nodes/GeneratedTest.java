package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        TextNode textNode = new TextNode("Hello world!");
        assertEquals("Hello world!", textNode.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Hello world!");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Hello world!");
        assertEquals("Hello world!", textNode.text());
    }

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("Hello world!");
        textNode.text("New text");
        assertEquals("New text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Hello world!");
        assertEquals("Hello world!", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello world!");
        TextNode splitText = textNode.splitText(5);
        assertEquals("Hello", textNode.text());
        assertEquals(" world!", splitText.text());
    }

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("Hello world!");
        StringBuilder accum = new StringBuilder();
        try {
            textNode.outerHtmlHead(accum, 0, new Document.OutputSettings());
            assertEquals("Hello world!", accum.toString());
        } catch (IOException e) {
            fail();
        }
    }

}