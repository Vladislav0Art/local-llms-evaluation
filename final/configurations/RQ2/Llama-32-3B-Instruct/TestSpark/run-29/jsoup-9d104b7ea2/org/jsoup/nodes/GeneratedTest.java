package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedTest {

    @Test
    public void nodeNameBlankText() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertEquals("", textNode.nodeName());
    }

    @Test
    public void nodeNameNonBlankText() {
        String text = "Test";
        TextNode textNode = new TextNode(text);
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void textBlankText() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertNull(textNode.text());
    }

    @Test
    public void textNonBlankText() {
        String text = "Test";
        TextNode textNode = new TextNode(text);
        assertEquals("Test", textNode.text());
    }

    @Test
    public void textNullText() {
        String text = null;
        try {
            new TextNode(text).text();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void createFromEncodedBlankString() {
        assertEquals("", TextNode.createFromEncoded(""));
    }

    @Test
    public void createFromEncodedNonBlankString() {
        assertEquals("test", TextNode.createFromEncoded("test"));
    }

    @Test
    public void cloneText() {
        String text = "Test";
        TextNode textNode = new TextNode(text);
        TextNode cloned = textNode.clone();
        assertTrue(!cloned.text().equals(text));
    }

    @Test
    public void splitTextOffsetAtEnd() {
        String text = "Test";
        TextNode textNode = new TextNode(text);
        TextNode result1 = textNode.splitText(0);
        TextNode result2 = textNode.splitText(result1.length());
        assertEquals("", result1.text());
        assertEquals(text, result2.text());
    }

    @Test
    public void splitTextOffsetAtBeginning() {
        String text = "Test";
        TextNode textNode = new TextNode(text);
        TextNode result1 = textNode.splitText(0);
        TextNode result2 = textNode.splitText(result1.length());
        assertEquals("", result1.text());
        assertEquals(text, result2.text());
    }

    @Test
    public void splitTextOffsetInMiddle() {
        String text = "Test";
        TextNode textNode = new TextNode(text);
        int offset = 3;
        TextNode result1 = textNode.splitText(offset);
        TextNode result2 = textNode.splitText(result1.length());
        assertEquals("Tes", result1.text());
        assertEquals("t", result2.text());
    }

    @Test
    public void getWholeTextBlank() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertEquals("", textNode.getWholeText());
    }

    @Test
    public void getWholeTextNonBlank() {
        String text = "Test";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void isBlankBlankText() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankNonBlankText() {
        String text = "Test";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}