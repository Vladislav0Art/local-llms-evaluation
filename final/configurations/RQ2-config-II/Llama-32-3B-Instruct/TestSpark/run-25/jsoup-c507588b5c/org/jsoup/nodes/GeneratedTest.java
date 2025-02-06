package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    @Test
    public void createTextNodeFromEmptyString() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals("", textNode.text());
    }

    @Test
    public void createTextNodeWithNonBlankString() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void textNodeGetWholeText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Appendable accum = output;
        Document.OutputSettings out = Document.OutputSettings.defaultValues();
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("Hello World", textNode.getWholeText());
    }

    @Test
    public void textNodeIsBlank() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void textNodeSplitText() {
        String text = "Hello\nWorld";
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Appendable accum = output;
        Document.OutputSettings out = Document.OutputSettings.defaultValues();
        int offset = 1;
        TextNode splitTextNode = textNode.splitText(offset);
        assertEquals("World", splitTextNode.text());
    }

    @Test
    public void textNodeNormaliseWhitespace() {
        String text = "Hello   World";
        assertEquals("Hello World", StringUtil.normaliseWhitespace(text));
    }

    @Test
    public void textNodeStripLeadingWhitespace() {
        String text = "   Hello World";
        assertEquals("Hello World", StringUtil.stripLeadingWhitespace(text));
    }

    @Test
    public void textNodeLastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(sb.append(' ')));
        assertFalse(TextNode.lastCharIsWhitespace(sb.append('A')));
    }

    @Test
    public void textNodeClone() {
        String text = "Hello World";
        TextNode originalTextNode = new TextNode(text);
        TextNode clonedTextNode = originalTextNode.clone();
        assertEquals(originalTextNode, clonedTextNode);
    }

    @Test
    public void textNodeCreateFromEncoded() {
        String encodedText = "UTF-8";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals(encodedText, textNode.text());
    }

    @Test
    public void textNodeToString() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        String expectedString = "<span class=\"text\">Hello World</span>";
        assertEquals(expectedString, textNode.toString());
    }

}