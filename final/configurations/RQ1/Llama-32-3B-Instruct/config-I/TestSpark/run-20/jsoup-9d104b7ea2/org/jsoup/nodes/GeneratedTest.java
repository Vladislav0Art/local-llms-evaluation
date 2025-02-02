package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class GeneratedTest {

    @Test
    public void createTextNode_EmptyText() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.value());
        assertTrue(textNode.isBlank());
    }

    @Test
    public void createTextNode_NormalisedWhitespace() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertEquals("", StringUtil.stripLeadingWhitespace(textNode.text()));
    }

    @Test
    public void createTextNode_Newline() {
        String text = "\n";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.value());
        assertEquals("\n", textNode.getWholeText());
    }

    @Test
    public void textMethod_ReturnsUnencodedText() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void textMethod_ReturnsNormalisedWhitespace() {
        String text = "   Hello World!  ";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World!", StringUtil.normaliseWhitespace(textNode.text()));
    }

    @Test
    public void isBlank_MethodReturnsTrueForBlankText() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_MethodReturnsFalseForNormalisedWhitespace() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_SplitsAtOffset() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        int offset = 6;
        TextNode result = textNode.splitText(offset);
        assertEquals("World!", result.getWholeText());
        assertEquals("Hello ", textNode.getWholeText());
    }

    @Test
    public void splitText_SplitsAtOffsetForBlankText() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        int offset = 1;
        TextNode result = textNode.splitText(offset);
        assertEquals("", result.getWholeText());
        assertEquals(" ", textNode.getWholeText());
    }

    @Test
    public void outerHtmlHead_PrettyPrintWithTrimming() {
        String text = "   Hello World!  ";
        TextNode textNode = new TextNode(text);
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Document outputDocument = new Document();
        outputDocument.appendChild(textNode);
        textNode.outerHtmlHead(accum, 0, out);
        verify(out).prettyPrint();
    }

    @Test
    public void outerHtmlTail_SkipTextForBlankOrEmpty() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Document outputDocument = new Document();
        outputDocument.appendChild(textNode);
        textNode.outerHtmlTail(accum, 0, out);
        verifyNoMoreInteractions(out);
    }

    @Test
    public void toString_ReturnsOuterHTML() {
        String text = "   Hello World!  ";
        TextNode textNode = new TextNode(text);
        assertEquals("<div>Hello World!</div>", textNode.toString());
    }

}