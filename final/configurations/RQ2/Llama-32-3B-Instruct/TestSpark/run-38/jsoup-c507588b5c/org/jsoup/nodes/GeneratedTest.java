package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newNodeTextTest() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("Hello, World!", textNode.text());
    }

    @Test
    public void nodeNameEmptyTextNodeTest() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.nodeName());
    }

    @Test
    public void nodeNameNonEmptyTextNodeTest() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void splitTextZeroOffsetTest() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode result = textNode.splitText(0);
        assertNotNull(result);
        assertEquals(textNode.text(), result.text());
    }

    @Test
    public void splitTextNonZeroOffsetTest() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode result = textNode.splitText(5);
        assertNotNull(result);
        assertEquals("World", result.text());
    }

    @Test
    public void isBlankEmptyTextNodeTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankNonEmptyTextNodeTest() {
        TextNode textNode = new TextNode("Hello, World!");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void outerHtmlHeadWithTagsTest() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("<a>Hello</a>");
        textNode.outerHtmlHead(accum, 0, out);
        String expectedOutput = "<a><b>Hello</b></a>";
        assertEquals(expectedOutput, accum.toString());
    }

    @Test
    public void outerHtmlTailWithTagsTest() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("<a>Hello</a>");
        textNode.outerHtmlTail(accum, 0, out);
        String expectedOutput = "</a>";
        assertEquals(expectedOutput, accum.toString());
    }

    @Test
    public void outerHtmlHeadWithNewlinesTest() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("\nHello\nWorld");
        textNode.outerHtmlHead(accum, 0, out);
        String expectedOutput = "<br><b>Hello</b></br><br><b>World</b>";
        assertEquals(expectedOutput, accum.toString());
    }

    @Test
    public void outerHtmlTailWithNewlinesTest() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("\nHello\nWorld");
        textNode.outerHtmlTail(accum, 0, out);
        String expectedOutput = "</br><br></b>";
        assertEquals(expectedOutput, accum.toString());
    }

    @Test
    public void cloneTextNodeTest() {
        TextNode original = new TextNode("Hello, World!");
        TextNode cloned = original.clone();
        assertNotNull(cloned);
        assertEquals(original.text(), cloned.text());
    }

}