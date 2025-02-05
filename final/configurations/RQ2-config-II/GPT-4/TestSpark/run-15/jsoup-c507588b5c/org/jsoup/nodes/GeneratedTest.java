package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        String text = "Test";
        TextNode tn = new TextNode(text);
        assertEquals(text, tn.getWholeText());
    }

    @Test
    public void nodeNameTest() {
        String text = "Test";
        TextNode tn = new TextNode(text);
        assertEquals("#text", tn.nodeName());
    }

    @Test
    public void textTest() {
        String someText = "Test";
        TextNode tn = new TextNode(someText);
        assertEquals(someText, tn.text());
    }

    @Test
    public void textWithTextTest() {
        String someText = "Test";
        TextNode tn = new TextNode("");
        tn.text(someText);
        assertEquals(someText, tn.text());
    }

    @Test
    public void getWholeTextTest() {
        String someText = "Test";
        TextNode tn = new TextNode(someText);
        assertEquals(someText, tn.getWholeText());
    }

    @Test
    public void isBlankTest() {
        String someText = "  ";
        TextNode tn = new TextNode(someText);
        assertTrue(tn.isBlank());
    }

    @Test
    public void isNotBlankTest() {
        String someText = "Test";
        TextNode tn = new TextNode(someText);
        assertFalse(tn.isBlank());
    }

    @Test
    public void splitTextTest() {
        String someText = "Test";
        TextNode tn = new TextNode(someText);
        TextNode splitNode = tn.splitText(2);
        assertEquals("Te", tn.getWholeText());
        assertEquals("st", splitNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        String someText = "Test";
        TextNode tn = TextNode.createFromEncoded(someText);
        assertEquals(someText, tn.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String textWithWhitespace = " T e s t";
        String normalisedText = TextNode.normaliseWhitespace(textWithWhitespace);
        assertEquals("Test", normalisedText);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String textWithLeadingWhitespace = " Test";
        String strippedText = TextNode.stripLeadingWhitespace(textWithLeadingWhitespace);
        assertEquals("Test", strippedText);
    }

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        StringBuilder sb = new StringBuilder("Test ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        StringBuilder sb = new StringBuilder("Test");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void toStringTest() {
        String someText = "Test";
        TextNode tn = new TextNode(someText);
        assertEquals(someText, tn.toString());
    }

}