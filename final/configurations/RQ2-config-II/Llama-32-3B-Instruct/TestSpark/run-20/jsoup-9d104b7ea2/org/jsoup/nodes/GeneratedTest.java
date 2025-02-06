package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeName_isTextTest() {
        String nodeName = "text";
        TextNode node = new TextNode(nodeName);
        assertEquals(nodeName, node.nodeName());
    }

    @Test
    public void text_returnsOriginalTextTest() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

    @Test
    public void text_setsNewTextTest() {
        String newText = " Foo Bar";
        TextNode node = new TextNode("Hello World!");
        node.text(newText);
        assertEquals(newText, node.text());
    }

    @Test
    public void getWholeText_returnsOriginalTextTest() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        assertEquals(text, node.getWholeText());
    }

    @Test
    public void isBlank_isTrueIfTextIsBlankTest() {
        TextNode node = new TextNode("   ");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlank_isFalseIfTextIsNotBlankTest() {
        TextNode node = new TextNode("Hello World!");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitText_splitsNodeAtOffsetTest() throws IOException {
        String text = "Hello World!";
        int offset = 6;
        TextNode node = new TextNode(text);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode splitText = node.splitText(offset);
        splitText.outerHtmlHead(accum, 0, out);
        assertEquals("Hello ", outContent.toString());
    }

    @Test
    public void clone_returnsNewTextNodeTest() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertNotSame(node, cloned);
        assertEquals(text, cloned.text());
    }

    @Test
    public void createFromEncoded_createTextNodeFromEncodedTextTest() {
        String encodedText = "Hello World!";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals(encodedText, textNode.getWholeText());
    }

}