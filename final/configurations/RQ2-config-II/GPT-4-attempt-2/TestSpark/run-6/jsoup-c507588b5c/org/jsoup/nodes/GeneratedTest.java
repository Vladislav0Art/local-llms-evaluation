package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Entities.EscapeMode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("Sample Text");
        assertNotNull(textNode);
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Sample Text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Sample Text");
        assertEquals("Sample Text", textNode.text());
    }

    @Test
    public void setTextTest() {
        TextNode textNode = new TextNode("Sample Text");
        textNode.text("New Text");
        assertEquals("New Text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Sample Text");
        assertEquals("Sample Text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode blankTextNode = new TextNode("");
        assertTrue(blankTextNode.isBlank());

        TextNode nonEmptyTextNode = new TextNode("Sample Text");
        assertFalse(nonEmptyTextNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Sample Text");
        TextNode splittedNode = textNode.splitText(6);
        assertEquals("Text", splittedNode.text());
        assertEquals("Sample ", textNode.text());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Sample Text");
        TextNode clonedNode = textNode.clone();
        assertEquals(textNode.text(), clonedNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode encodedTextNode = TextNode.createFromEncoded("Sample Encoded Text", false);
        assertEquals("Sample Encoded Text", encodedTextNode.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Sample Text");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new OutputSettings().escapeMode(EscapeMode.xhtml));
        assertEquals("Sample Text", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("Sample Text");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, new OutputSettings().escapeMode(EscapeMode.xhtml));
        assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Sample Text");
        assertEquals("Sample Text", textNode.toString());
    }

}