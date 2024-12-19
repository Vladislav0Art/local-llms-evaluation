package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newTextNode_textIsBlankTest() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void newTextNode_textIsNotBlankTest() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void createFromEncoded_emptyStringTest() {
        String encodedText = "";
        TextNode textNode = new TextNode(encodedText);
        assertNotNull(textNode);
    }

    @Test
    public void createFromEncoded_nonEmptyStringTest() {
        String encodedText = "&lt;&gt;";
        TextNode textNode = new TextNode(encodedText);
        assertEquals("&lt;", textNode.text());
    }

    @Test
    public void stripLeadingWhitespace_testStringWithMultipleSpacesTest() {
        String testString = "   ";
        String result = TextNode.stripLeadingWhitespace(testString);
        assertTrue(result.equals(" "));
    }

    @Test
    public void stripLeadingWhitespace_testStringWithoutLeadingSpacesTest() {
        String testString = "Hello World";
        String result = TextNode.stripLeadingWhitespace(testString);
        assertEquals(testString, result);
    }
}

class TextNode {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

    public static String stripLeadingWhitespace(String text) {
        // implementation
        return text;
    }

    public String text() {
        return text;
    }

}