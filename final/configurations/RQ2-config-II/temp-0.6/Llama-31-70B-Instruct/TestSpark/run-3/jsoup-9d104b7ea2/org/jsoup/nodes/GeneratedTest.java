package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("testTextNode");
        assertNotNull(textNode);
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("testTextNode");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("testTextNode");
        assertEquals("testTextNode", textNode.text());
    }

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("testTextNode");
        textNode.text("newTextNode");
        assertEquals("newTextNode", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("testTextNode");
        assertEquals("testTextNode", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("testTextNode");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("testTextNode");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("stTextNode", splitTextNode.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("testTextNode");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 1, Mockito.mock(Document.OutputSettings.class));
        assertEquals("testTextNode", accum.toString());
    }

}