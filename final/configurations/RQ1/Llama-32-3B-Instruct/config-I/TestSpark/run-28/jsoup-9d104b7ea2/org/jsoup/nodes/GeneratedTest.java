package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals(text, textNode.value());
    }

    @Test
    public void nodeName_GivenTextNode_ReturnsCorrectString() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_GivenTextNode_ReturnsCorrectText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(StringUtil.normaliseWhitespace("Hello World"), textNode.text());
    }

    @Test
    public void text_GivenBlankTextNode_ReturnsBlankString() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.text().isEmpty());
    }

    @Test
    public void isBlank_GivenTextNode_ReturnsCorrectBoolean() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
        text = "";
        textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitText_GivenTextNode_SplitsCorrectly() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        int offset = 7;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals(7, tailNode.getWholeText().length());
    }

    @Test
    public void splitText_GivenBlankTextNode_ThrowsException() {
        String text = "";
        TextNode textNode = new TextNode(text);
        try {
            int offset = 1;
            textNode.splitText(offset);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void outerHtmlHead_GivenTextNode_ReturnsCorrectString() {
        TextNode textNode = new TextNode("Hello World");
        Document document = Mockito.mock(Document.class);
        textNode.parentNode = document;
        byte[] accum = new byte[1024];
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint = true;
        try {
            textNode.outerHtmlHead(new Appendable() {
            }, depth, out);
            fail("Expected Exception");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void outerHtmlTail_GivenTextNode_ReturnsCorrectString() {
        TextNode textNode = new TextNode("");
        Document document = Mockito.mock(Document.class);
        textNode.parentNode = document;
        byte[] accum = new byte[1024];
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        try {
            textNode.outerHtmlTail(new Appendable() {
            }, depth, out);
            fail("Expected Exception");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void createTextNodeFromEncoded_GivenEncodedText_ReturnsCorrectTextNode() {
        String encodedText = "&lt;Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals("Hello", textNode.value());
    }

    @Test
    public void normaliseWhitespace_GivenString_ReturnsCorrectString() {
        String text = "   ";
        assertEquals(StringUtil.normaliseWhitespace(text), text);
    }

    @Test
    public void stripLeadingWhitespace_GivenString_ReturnsCorrectString() {
        String text = "Hello World";
        assertEquals(StringUtil.stripLeadingWhitespace(text), "Hello World");
    }

    @Test
    public void lastCharIsWhitespace_GivenStringBuilder_ReturnsCorrectBoolean() {
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        sb.setLength(0);
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}