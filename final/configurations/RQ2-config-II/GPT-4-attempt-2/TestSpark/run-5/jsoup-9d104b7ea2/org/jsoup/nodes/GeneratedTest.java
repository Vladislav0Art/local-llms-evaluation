package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        TextNode tn = new TextNode("sample text");
        assertNotNull(tn);
    }

    @Test
    public void nodeNameTest() {
        TextNode tn = new TextNode("sample text");
        assertEquals("#text", tn.nodeName());
    }

    @Test
    public void textTest() {
        TextNode tn = new TextNode("sample text");
        assertEquals("sample text", tn.text());
    }

    @Test
    public void setTextTest() {
        TextNode tn = new TextNode("sample text");
        tn.text("new sample text");
        assertEquals("new sample text", tn.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode tn = new TextNode("sample text");
        assertEquals("sample text", tn.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode tn = new TextNode("");
        assertTrue(tn.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("sample text");
        TextNode splitNode = tn.splitText(6);
        assertEquals("sample", tn.getWholeText());
        assertEquals(" text", splitNode.getWholeText());
    }

    @Test
    public void toStringTest() {
        TextNode tn = new TextNode("sample text");
        assertEquals("sample text", tn.toString());
    }

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("sample text");
        TextNode clonedNode = tn.clone();
        assertNotSame(tn, clonedNode);
        assertEquals(tn.getWholeText(), clonedNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode tn = TextNode.createFromEncoded("sample text");
        assertEquals("sample text", tn.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = TextNode.normaliseWhitespace("    sample   text    ");
        assertEquals(" sample text ", text);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = TextNode.stripLeadingWhitespace("    sample text    ");
        assertEquals("sample text    ", text);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("sample text ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode tn = new TextNode("sample text");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        tn.outerHtmlHead(accum, 0, out);
        assertEquals("sample text", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode tn = new TextNode("sample text");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        tn.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

}