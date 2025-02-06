package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeName() {
        TextNode textNode = new TextNode("test");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void text() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void textString() {
        TextNode textNode = new TextNode(" test ");
        assertEquals(" test ", textNode.text());
    }

    @Test
    public void splitTextOffsetZero() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(0);
        assertNotNull(result);
        assertEquals("test", result.text());
    }

    @Test
    public void splitTextOffsetNonZero() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(1);
        assertNotNull(result);
        assertEquals("est", result.text());
    }

    @Test
    public void getWholeText() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void isBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void outerHtmlHeadAppendableDepth0DocumentOutputSettings() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = Document.OutputSettings.STANDARD;
        TextNode textNode = new TextNode("test");
        textNode.outerHtmlHead(accum, 0, out);
        assertTrue(outContent.toString().contains("<p>test</p>"));
    }

    @Test
    public void outerHtmlTailAppendableDepth1DocumentOutputSettings() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = Document.OutputSettings.STANDARD;
        TextNode textNode = new TextNode("test");
        textNode.outerHtmlTail(accum, 1, out);
        assertTrue(outContent.toString().contains("</p>"));
    }

    @Test
    public void toString() {
        TextNode textNode = new TextNode("test");
        assertEquals("<text>test</text>", textNode.toString());
    }

    @Test
    public void clone() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.clone();
        assertNotNull(result);
        assertEquals(textNode.text(), result.text());
    }

}