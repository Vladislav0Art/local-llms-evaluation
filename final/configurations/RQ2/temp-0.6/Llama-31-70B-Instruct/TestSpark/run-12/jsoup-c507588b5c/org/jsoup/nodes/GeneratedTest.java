package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("text");
        TextNode splitText = textNode.splitText(2);
        assertEquals("te", textNode.text());
        assertEquals("xt", splitText.text());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("text");
        TextNode newTextNode = textNode.text("newText");
        assertEquals("newText", newTextNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());
    }

}