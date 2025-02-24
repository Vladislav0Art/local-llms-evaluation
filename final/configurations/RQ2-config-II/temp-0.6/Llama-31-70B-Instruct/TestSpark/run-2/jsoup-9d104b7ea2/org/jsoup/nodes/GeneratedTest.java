package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    // test constructor with mocked TextNode

    @Test
    public void constructorTest() {
        TextNode textNode = Mockito.mock(TextNode.class);
        assertEquals(textNode, new TextNode("text"));
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = Mockito.mock(TextNode.class);
        Mockito.when(textNode.nodeName()).thenReturn("text");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = Mockito.mock(TextNode.class);
        Mockito.when(textNode.text()).thenReturn("text");
        assertEquals("text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = Mockito.mock(TextNode.class);
        Mockito.when(textNode.getWholeText()).thenReturn("text");
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = Mockito.mock(TextNode.class);
        Mockito.when(textNode.isBlank()).thenReturn(false);
        assertFalse(textNode.isBlank());
    }

}