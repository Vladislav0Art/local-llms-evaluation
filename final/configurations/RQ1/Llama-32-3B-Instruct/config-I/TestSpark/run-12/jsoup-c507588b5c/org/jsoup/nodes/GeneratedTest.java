package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedTest {

    @Test
    public void constructorTextTest() {
        TextNode node = new TextNode("Hello World");
        assertNotNull(node.value);
        assertEquals("Hello World", node.value);
    }

    @Test
    public void textGetWholeTextTest() {
        TextNode node = new TextNode("   ");
        String result = node.getWholeText();
        assertEquals("   ", result);

        TextNode node2 = new TextNode("This is a test");
        String result2 = node2.getWholeText();
        assertEquals("This is a test", result2);
    }

    @Test
    public void textGetWholeTextTrimmingWhitespaceTest() {
        String normalisedText = StringUtil.normaliseWhitespace("   Hello World   ");
        TextNode node = new TextNode(normalisedText);
        String result = node.getWholeText();
        assertEquals(normalisedText, result);
    }

    @Test
    public void textSetAndGetTextTest() {
        TextNode node = new TextNode("");
        assertNotNull(node.text());
        assertEquals("", node.text());

        node.text("New test");
        assertEquals("New test", node.text());
    }

    @Test
    public void isBlankTest() {
        TextNode node1 = new TextNode("");
        assertTrue(node1.isBlank());

        TextNode node2 = new TextNode("   ");
        assertTrue(node2.isBlank());

        TextNode node3 = new TextNode("Hello World");
        assertFalse(node3.isBlank());
    }

    @Test
    public void splitTextSplitAtOffsetTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode tail = node.splitText(6);
        assertEquals(0, tail.value.indexOf("World"));
    }

    @Test
    public void splitTextInvalidOffsetTest() {
        TextNode node = new TextNode("   ");
        assertThrows(IndexOutOfBoundsException.class, () -> node.splitText(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> node.splitText(10));
    }

    @Test
    public void outerHtmlHeadTest() {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings(true);
        TextNode node = new TextNode("   ");
        node.outerHtmlHead(outStream, 0, settings);
        assertEquals("<p></p>", outStream.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings(true);
        TextNode node = new TextNode("   ");
        node.outerHtmlTail(outStream, 0, settings);
    }

    @Test
    public void toStringTest() {
        TextNode node = new TextNode("");
        assertEquals("", node.toString());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Hello World");
        TextNode clone = node.clone();
        assertNotNull(clone);
        assertEquals(node.value, clone.value);
    }

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;Hello World&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello World", node.text());
    }

}