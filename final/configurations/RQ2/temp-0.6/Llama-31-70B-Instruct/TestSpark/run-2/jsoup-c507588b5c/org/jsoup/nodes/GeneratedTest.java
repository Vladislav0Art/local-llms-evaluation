package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("This is a test");
        assertNotNull(textNode);
        assertEquals("This is a test", textNode.text());
    }

    @Test
    public void textNodeConstructorNullTest() {
        TextNode textNode = new TextNode(null);
        assertNotNull(textNode);
        assertEquals("", textNode.text());
    }

    @Test
    public void textNodeNodeNameTest() {
        TextNode textNode = new TextNode("This is a test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textNodeTextTest() {
        TextNode textNode = new TextNode("This is a test");
        assertEquals("This is a test", textNode.text());
    }

    @Test
    public void textNodeTextNullTest() {
        TextNode textNode = new TextNode("This is a test");
        textNode.text(null);
        assertEquals("", textNode.text());
    }

    @Test
    public void textNodeGetWholeTextTest() {
        TextNode textNode = new TextNode("This is a test");
        assertEquals("This is a test", textNode.getWholeText());
    }

    @Test
    public void textNodeIsBlankTest() {
        TextNode textNode = new TextNode("This is a test");
        assertFalse(textNode.isBlank());
    }

}