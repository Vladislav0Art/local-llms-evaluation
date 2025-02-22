package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void createFromEncodedTextNodeTest() {
        String encodedText = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<", textNode.getWholeText());
    }

    @Test
    public void textNodeTest() {
        String encodedText = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        textNode.text(encodedText);
        assertEquals(encodedText, textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        String encodedText = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        String encodedText = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        String encodedText = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        TextNode tailNode = textNode.splitText(1);
        assertEquals("&", textNode.getWholeText());
        assertEquals("lt;", tailNode.getWholeText());
    }

}