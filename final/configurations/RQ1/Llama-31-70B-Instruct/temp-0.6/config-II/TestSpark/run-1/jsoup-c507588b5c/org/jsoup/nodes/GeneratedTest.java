package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&amp;lt;");
        assertEquals("&lt;", textNode.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("  test  ");
        assertEquals("test", textNode.text());
    }

    @Test
    public void textAndSetTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
        textNode.text(" new test ");
        assertEquals("new test", textNode.text());
    }

    @Test
    public void getWholeTextAndIsBlankTest() {
        TextNode textNode = new TextNode("  test  \n");
        assertEquals("  test  \n", textNode.getWholeText());
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode newTextNode = textNode.splitText(2);
        assertEquals("te", textNode.text());
        assertEquals("st", newTextNode.text());
    }

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, null);
        assertEquals("test", accum.toString());
    }

}