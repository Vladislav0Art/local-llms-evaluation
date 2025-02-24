package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.nodeName());
        assertEquals("test", textNode.text());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("te", textNode.text());
        assertEquals("st", splitTextNode.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("test");
        StringWriter stringWriter = new StringWriter();
        textNode.outerHtmlHead(stringWriter, 0, Mockito.mock(Document.OutputSettings.class));
        assertEquals("test", stringWriter.toString());
    }

}