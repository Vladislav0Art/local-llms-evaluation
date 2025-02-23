package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("  foo  ");
        assertEquals("foo", textNode.text());
    }

    @Test
    public void textWithZeroLengthTest() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("  foo  ");
        assertEquals("  foo  ", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("  ");
        assertEquals(true, textNode.isBlank());
    }

    @Test
    public void isBlankWithZeroLengthTest() {
        TextNode textNode = new TextNode("");
        assertEquals(true, textNode.isBlank());
    }

    @Test
    public void isBlankWithNonBlankTest() {
        TextNode textNode = new TextNode("foo");
        assertEquals(false, textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("foobar");
        TextNode newNode = textNode.splitText(3);
        assertEquals("foo", textNode.getWholeText());
        assertEquals("bar", newNode.getWholeText());
    }

}