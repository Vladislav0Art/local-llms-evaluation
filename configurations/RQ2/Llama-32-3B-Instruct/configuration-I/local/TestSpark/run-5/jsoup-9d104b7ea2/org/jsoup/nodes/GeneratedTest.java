package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedTest {

    @Test
    public void newNodeTextEmptyString() {
        String result = new TextNode("").text();
        assertEquals("", result);
    }

    @Test
    public void newNodeTextSingleCharacter() {
        String result = new TextNode("a").text();
        assertEquals("a", result);
    }

    @Test
    public void newNodeTextMultipleCharacters() {
        String result = new TextNode("abc").text();
        assertEquals("abc", result);
    }

    @Test
    public void newTextFromEncodedSingleCharacter() {
        String encodedText = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<", textNode.text());
    }

    @Test
    public void newTextFromEncodedMultipleCharacters() {
        String encodedText = "&lt;a&gt;b&gt;</a>";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<a>b</a>", textNode.text());
    }

    @Test
    public void cloneTextNode() {
        TextNode original = new TextNode("Hello");
        TextNode clone = original.clone();
        assertNotNull(clone);
        assertEquals(original, clone);
    }

    @Test
    public void splitTextZeroOffset() {
        TextNode textNode = new TextNode("Hello World");
        TextNode leftSibling = textNode.splitText(0);
        assertNotNull(leftSibling);
        assertTrue(leftSibling.text().equals("Hello"));
    }

    @Test
    public void splitTextNonZeroOffset() {
        TextNode textNode = new TextNode("Hello World");
        TextNode leftSibling = textNode.splitText(3);
        assertNotNull(leftSibling);
        assertTrue(leftSibling.text().equals("World"));
    }

    @Test
    public void isBlankTextNodeEmptyString() {
        boolean result = new TextNode("").isBlank();
        assertTrue(result);
    }

    @Test
    public void isBlankTextNodeNonEmptyString() {
        boolean result = new TextNode("Hello").isBlank();
        assertFalse(result);
    }

    @Test
    public void getWholeTextTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}