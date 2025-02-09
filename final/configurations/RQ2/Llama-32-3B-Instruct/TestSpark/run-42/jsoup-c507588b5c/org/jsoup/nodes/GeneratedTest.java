package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void createTextNodeFromEmptyString() {
        assertSame("", TextNode.createFromEncoded(""));
    }

    @Test
    public void createTextNodeFromSingleSpace() {
        String expected = " ";
        assertSame(expected, TextNode.createFromEncoded(" "));
    }

    @Test
    public void createTextNodeFromMultipleSpaces() {
        String expected = "   ";
        assertSame(expected, TextNode.createFromEncoded("   "));
    }

    @Test
    public void textNodeTextReturnsOriginalString() {
        String originalText = "Hello World!";
        TextNode textNode = new TextNode(originalText);
        assertEquals(originalText, textNode.text());
    }

    @Test
    public void textNodeGetWholeTextReturnsOriginalString() {
        String originalText = "Hello World!";
        TextNode textNode = new TextNode(originalText);
        assertEquals(originalText, textNode.getWholeText());
    }

    @Test
    public void isBlankTextNodeReturnsFalse() {
        String nonBlankText = "Hello World!";
        TextNode textNode = new TextNode(nonBlankText);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void isBlankTextNodeReturnsTrueForEmptyString() {
        TextNode emptyText = new TextNode("");
        assertTrue(emptyText.isBlank());
    }

    @Test
    public void stripLeadingWhitespaceRemovesLeadingSpaces() {
        String textWithLeadingWhitespaces = "   Hello World!";
        String expected = "Hello World!";
        assertSame(expected, StringUtil.stripLeadingWhitespace(textWithLeadingWhitespaces));
    }
}

class StringUtil {

    public static String stripLeadingWhitespace(String text) {
        int i = 0;
        while (i < text.length() && Character.isWhitespace(text.charAt(i))) {
            i++;
        }
        return text.substring(i);
    }

}