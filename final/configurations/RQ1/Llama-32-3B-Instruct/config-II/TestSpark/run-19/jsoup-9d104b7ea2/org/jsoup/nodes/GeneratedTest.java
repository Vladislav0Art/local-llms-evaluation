package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void createTextNode_ValidText_ReturnsTextNode() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        assertNotNull(node);
        assertEquals(text, node.value());
    }

    @Test
    public void createTextNode_EmptyString_ReturnsEmptyTextNode() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

    @Test
    public void text_GetTextContent_ReturnsUnencodedText() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        assertEquals("Hello World!", StringUtil.normaliseWhitespace(node.text()));
    }

    @Test
    public void text_SetTextContent_ReturnsTextNode() {
        String text = "Hello World!";
        TextNode node = new TextNode();
        node.text(text);
        assertNotNull(node.value());
        assertEquals(text, StringUtil.normaliseWhitespace(node.text()));
    }

    @Test
    public void getWholeText_GetUnencodedTextReturnsWholeText() {
        String text = "Hello\nWorld!";
        TextNode node = new TextNode(text);
        assertEquals("Hello\nWorld!", node.getWholeText());
    }

    @Test
    public void isBlank_ChecksForEmptyOrWhitespaceText_ReturnsTrue() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

    @Test
    public void splitText_SplitsTextNodeAtOffset_ReturnsNewTextNode() {
        String text = "Hello\nWorld!";
        int offset = 6;
        TextNode node = new TextNode(text);
        TextNode tailNode = node.splitText(offset);
        assertNotNull(tailNode.value());
        assertEquals("World!", StringUtil.normaliseWhitespace(tailNode.text()));
    }

    @Test
    public void outerHtmlHead_IndentsAndEscapesTextProperly() throws IOException {
        String text = "Hello\nWorld!";
        Document document = new Document();
        TextNode node = new TextNode(text);
        Appendable accum = new ByteArrayBuilder(1024);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        node.outerHtmlHead(accum, depth, out);
        String expected = "<div><p>Hello</p><br><p>World!</p></div>";
        assertEquals(expected, accum.toString());
    }

    @Test
    public void outerHtmlTailDoesNotOutputAnything() throws IOException {
        TextNode node = new TextNode("");
        Appendable accum = new ByteArrayBuilder(1024);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        node.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void clone_ClonesTextNode() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        TextNode cloned = node.clone();
        assertNotNull(cloned.value());
        assertEquals(text, StringUtil.normaliseWhitespace(cloned.text()));
    }

}