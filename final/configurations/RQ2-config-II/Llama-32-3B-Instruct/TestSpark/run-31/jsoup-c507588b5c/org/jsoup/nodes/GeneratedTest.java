package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
    }

    @Test
    public void nodeName_ReturnsCorrectNodeName() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void text_ReturnsTextNodeText() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void text_SetsTextNodeText() {
        TextNode textNode = new TextNode();
        textNode.text("Hello, World!");
        assertNotNull(textNode.text());
    }

    @Test
    public void getWholeText_ReturnsTextNodeTextAndParentsText() throws IOException {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = new Document(new Appendable(), null, 0);
        textNode.outerHtmlHead(out, 1, document.getOutputSettings());
        assertEquals(text, out.toString().trim());
    }

    @Test
    public void isBlank_ReturnsFalseWhenTextNodeTextIsNotEmpty() {
        TextNode textNode = new TextNode("Hello, World!");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void isBlank_ReturnsTrueWhenTextNodeTextIsEmpty() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitText_SplittingAtOffset_ReturnsSecondPartOfTextNodeText() throws IOException {
        String text = "Hello, World!";
        int offset = 6;
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = new Document(new Appendable(), null, 0);
        TextNode secondPart = textNode.splitText(offset);
        assertEquals("World!", secondPart.text());
    }

    @Test
    public void outerHtmlHead_SetsOuterHtmlHeadOfTextNode() throws IOException {
        String text = "Hello, World!";
        int depth = 1;
        Document.OutputSettings out = null;
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        textNode.outerHtmlHead(outStream, depth, out);
        assertEquals("div><p>Hello, World!</p></div>", outStream.toString());
    }

    @Test
    public void outerHtmlTail_SetsOuterHtmlTailOfTextNode() {
        String text = "Hello, World!";
        int depth = 1;
        Document.OutputSettings out = null;
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        textNode.outerHtmlTail(outStream, depth, out);
        assertEquals("", outStream.toString());
    }

    @Test
    public void clone_ReturnsNewTextNodeWithSameText() {
        String text = "Hello, World!";
        TextNode originalTextNode = new TextNode(text);
        TextNode clonedTextNode = originalTextNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(text, clonedTextNode.text());
    }

}