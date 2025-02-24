package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorWithNullArgumentTest() {
        TextNode textNode = new TextNode(null);
        assertNotNull(textNode);
        assertEquals("", textNode.text());
    }

    @Test
    public void constructorWithEmptyStringArgumentTest() {
        TextNode textNode = new TextNode("");
        assertNotNull(textNode);
        assertEquals("", textNode.text());
    }

    @Test
    public void constructorWithNonEmptyStringArgumentTest() {
        TextNode textNode = new TextNode("test");
        assertNotNull(textNode);
        assertEquals("test", textNode.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textWithNullArgumentTest() {
        TextNode textNode = new TextNode("test");
        TextNode newTextNode = textNode.text(null);
        assertNotNull(newTextNode);
        assertEquals("", newTextNode.text());
    }

    @Test
    public void textWithEmptyStringArgumentTest() {
        TextNode textNode = new TextNode("test");
        TextNode newTextNode = textNode.text("");
        assertNotNull(newTextNode);
        assertEquals("", newTextNode.text());
    }

    @Test
    public void textWithNonEmptyStringArgumentTest() {
        TextNode textNode = new TextNode("test");
        TextNode newTextNode = textNode.text("new test");
        assertNotNull(newTextNode);
        assertEquals("new test", newTextNode.text());
    }

}