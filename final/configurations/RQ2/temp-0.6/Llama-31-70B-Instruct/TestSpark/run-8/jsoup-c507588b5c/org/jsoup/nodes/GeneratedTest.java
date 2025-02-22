package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("raw text");
        assertEquals("raw text", textNode.coreValue());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("raw text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("raw text");
        assertEquals("text", textNode.text());
    }

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("raw text");
        textNode.text("new text");
        assertEquals("new text", textNode.coreValue());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("raw text");
        assertEquals("raw text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        assertEquals(true, textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("raw text");
        TextNode tailNode = textNode.splitText(3);
        assertEquals("raw", textNode.coreValue());
        assertEquals("text", tailNode.coreValue());
    }

}