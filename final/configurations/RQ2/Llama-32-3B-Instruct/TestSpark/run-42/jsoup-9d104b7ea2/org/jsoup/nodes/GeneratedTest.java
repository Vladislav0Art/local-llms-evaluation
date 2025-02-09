package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedTest {

    @Test
    public void createTextFromEncoded_WithValidEncodedText_ReturnsText() {
        String encodedText = "Hello, World!";
        TextNode textNode = Document.createTextNode(encodedText);
        assertNotNull(textNode.text());
        assertEquals(encodedText, textNode.text());
    }

    @Test
    public void createTextFromEncoded_WithInvalidEncodedText_ThrowsIOException() {
        String invalidEncodedText = "Invalid encoded text";
        java.io.IOException e = null;
        try {
            Document.createTextNode(invalidEncodedText);
            fail("IOException was not thrown");
        } catch (java.io.IOException ex) {
            assertEquals(0, ex.getMessage().length());
        }
    }

    @Test
    public void createTextFromEncoded_EmptyString_ReturnsEmptyTextNode() {
        String emptyEncodedText = "";
        TextNode textNode = Document.createTextNode(emptyEncodedText);
        assertNotNull(textNode);
        assertEquals("", textNode.text());
    }

    @Test
    public void splitText_WithZeroOffset_ReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode result = textNode.splitText(0);
        assertEquals(textNode, result);
    }

    @Test
    public void splitText_WithNonZeroOffset_ReturnsNewTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        String substring = "World!";
        TextNode result = textNode.splitText(substring.length());
        assertNotNull(result.text());
        assertTrue(result.text().equals(substring));
    }

    @Test
    public void splitText_WithOffsetGreaterThanOrEqualLength_ReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        int offset = 10;
        TextNode result = textNode.splitText(offset);
        assertEquals(textNode, result);
    }

    @Test
    public void normaliseWhitespace_EmptyString_ReturnsEmptyString() {
        String input = "";
        String expected = "";
        String result = org.jsoup.helper.StringUtil.normaliseWhitespace(input);
        assertEquals(expected, result);
    }

    @Test
    public void normaliseWhitespace_NoWhitespace_ReturnsOriginalString() {
        String input = "Hello, World!";
        String expected = "Hello, World!";
        String result = org.jsoup.helper.StringUtil.normaliseWhitespace(input);
        assertEquals(expected, result);
    }

    @Test
    public void normaliseWhitespace_HasWhitespace_ReturnsStringWithoutLeadingWhitespace() {
        String input = "   Hello, World!";
        String expected = "Hello, World!";
        String result = org.jsoup.helper.StringUtil.normaliseWhitespace(input);
        assertTrue(result.startsWith(expected));
    }

    @Test
    public void lastCharIsWhitespace_EmptyStringBuilder_ReturnsFalse() {
        StringBuilder emptyStringBuilder = new StringBuilder();
        boolean result = org.jsoup.helper.StringUtil.lastCharIsWhitespace(emptyStringBuilder);
        assertFalse(result);
    }

    @Test
    public void lastCharIsWhitespace_HasNonEmptyStringBuilder_ReturnsTrue() {
        StringBuilder nonEmptyStringBuilder = new StringBuilder("   ");
        boolean result = org.jsoup.helper.StringUtil.lastCharIsWhitespace(nonEmptyStringBuilder);
        assertTrue(result);
    }

}