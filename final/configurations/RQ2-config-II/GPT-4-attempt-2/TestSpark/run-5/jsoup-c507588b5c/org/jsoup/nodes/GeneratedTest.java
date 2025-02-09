package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        TextNode textNode = new TextNode("Test");

        assertNotNull(textNode);
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test");

        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Test Text");

        assertEquals("Test Text", textNode.text());
    }

    @Test
    public void textSettingTest() {
        TextNode textNode = new TextNode("Test");
        textNode.text("Replaced Text");

        assertEquals("Replaced Text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("This is the whole text");

        assertEquals("This is the whole text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");

        assertTrue(textNode.isBlank());
    }

    @Test
    public void notBlankTest() {
        TextNode textNode = new TextNode("Not blank");

        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Original Text");

        assertEquals("Original", textNode.splitText(8).getWholeText());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Clone me");
        TextNode cloned = textNode.clone();

        assertEquals(cloned.text(), textNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("EncodedText", true);

        assertNotNull(textNode);
    }

    @Test
    public void normaliseWhitespaceTest() {
        String normalised = TextNode.normaliseWhitespace(" Normalise  my  whitespace ");

        assertEquals("Normalise my whitespace", normalised);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String stripped = TextNode.stripLeadingWhitespace("   Stripped");

        assertEquals("Stripped", stripped);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder().append("Whitespace at end ");

        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void lastCharIsNotWhitespaceTest() {
        StringBuilder sb = new StringBuilder().append("No Whitespace at end");

        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}