package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedTest {

    @Test
    public void createTextFromEmptyString_isBlank() {
        TextNode textNode = TextNode.createFromEncoded("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void createTextFromSingleCharacter_notBlank() {
        TextNode textNode = TextNode.createFromEncoded("a");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextAtStart_returnsSameTextNode() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        int offset = 0;
        TextNode newText = textNode.splitText(offset);
        assertEquals(originalText, newText.text());
    }

    @Test
    public void splitTextAtMiddle_returnsTwoNodes() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        int offset = 6;
        TextNode[] nodes = textNode.splitText(offset);
        assertEquals(2, nodes.length);
        assertEquals("World", nodes[0].text());
        assertEquals("Hello", nodes[1].text());
    }

    @Test
    public void splitTextAtEnd_returnsSameTextNode() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        int offset = 11;
        TextNode newText = textNode.splitText(offset);
        assertEquals(originalText, newText.text());
    }

    @Test
    public void splitTextAtInvalidOffset_throwsIOException() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        int offset = -1;
        try {
            textNode.splitText(offset);
            fail("Expected IOException");
        } catch (IOException e) {
        }

        offset = 12; // beyond the length of the string
        try {
            textNode.splitText(offset);
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }

    @Test
    public void isBlank_emptyString_returnsTrue() {
        TextNode textNode = TextNode.createFromEncoded("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_nonEmptyString_returnsFalse() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void normaliseWhitespace_preservesNonWhitespaceChars() {
        String text = "   Hello   World  ";
        String expected = "Hello World";
        assertEquals(expected, TextNode.normaliseWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespace_leadingWhitespaceRemoved() {
        String text = "   Hello World  ";
        String expected = "Hello World";
        assertEquals(expected, TextNode.stripLeadingWhitespace(text));
    }

}