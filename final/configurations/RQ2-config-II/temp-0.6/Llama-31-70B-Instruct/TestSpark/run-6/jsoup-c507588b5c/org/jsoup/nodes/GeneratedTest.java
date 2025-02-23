package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Text");
        assertEquals("Text", textNode.text());
    }

    @Test
    public void textWithWhitespaceTest() {
        TextNode textNode = new TextNode("   Text   ");
        assertEquals("Text", textNode.text());
    }

    @Test
    public void textWithWhitespaceAndNewlineTest() {
        TextNode textNode = new TextNode("   Text\nText   ");
        assertEquals("Text Text", textNode.text());
    }

    @Test
    public void textWithNewlineTest() {
        TextNode textNode = new TextNode("Text\nText");
        assertEquals("Text Text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Text");
        assertEquals("Text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("Text");
        assertFalse(textNode.isBlank());
    }

}