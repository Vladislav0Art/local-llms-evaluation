package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void textNodeInitializationTest() {
        TextNode textNode = new TextNode("test");
        assertNotNull(textNode);
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        String result = textNode.nodeName();
        assertEquals("#text", result);
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("test");
        String result = textNode.text();
        assertEquals("test", result);
    }

    @Test
    public void setTextTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("newTest");
        String result = textNode.text();
        assertEquals("newTest", result);
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("test");
        String result = textNode.getWholeText();
        assertEquals("test", result);
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode(" ");
        boolean result = textNode.isBlank();
        assertTrue(result);
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("testing");
        TextNode splitNode = textNode.splitText(4);
        Assert.assertEquals("test", textNode.getWholeText());
        assertEquals("ing", splitNode.getWholeText());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("test", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertEquals("", sb.toString());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("test");
        TextNode cloneNode = textNode.clone();
        assertEquals(textNode.text(), cloneNode.text());
        assertNotSame(textNode, cloneNode);
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("test&amp;", false);
        assertEquals("test&", textNode.text());
    }

}