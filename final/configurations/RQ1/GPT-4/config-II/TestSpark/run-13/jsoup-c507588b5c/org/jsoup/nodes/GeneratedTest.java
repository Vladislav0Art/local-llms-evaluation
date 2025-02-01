package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("  test text  ");
        assertEquals("test text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("test text");
        assertEquals("test text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("    ");
        assertTrue(textNode.isBlank());

        textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test text");
        TextNode splitTextNode = textNode.splitText(4);
        assertEquals("test", textNode.getWholeText());
        assertEquals(" text", splitTextNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;html&gt;");
        assertEquals("<html>", textNode.text());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("test");
        TextNode cloneTextNode = textNode.clone();
        assertEquals(textNode.text(), cloneTextNode.text());
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.toString());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, new Document.OutputSettings().prettyPrint(true));
        assertEquals("test", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlTail(sb, 0, new Document.OutputSettings().prettyPrint(true));
        assertEquals("", sb.toString());
    }

}