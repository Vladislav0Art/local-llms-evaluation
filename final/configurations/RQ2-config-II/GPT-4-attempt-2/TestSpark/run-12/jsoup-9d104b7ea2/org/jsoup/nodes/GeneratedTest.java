package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode tn = new TextNode("test text");
        assertEquals("test text", tn.getWholeText());
    }

    @Test
    public void nodeNameTest() {
        TextNode tn = new TextNode("test text");
        assertEquals("#text", tn.nodeName());
    }

    @Test
    public void textTest() {
        TextNode tn = new TextNode("test text");
        assertEquals("test text", tn.text());
    }

    @Test
    public void textChangeTest() {
        TextNode tn = new TextNode("test text");
        tn.text("changed text");
        assertEquals("changed text", tn.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode tn = new TextNode("test text");
        assertEquals("test text", tn.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode tn = new TextNode("");
        assertTrue(tn.isBlank());
    }

    @Test
    public void isNotBlankTest() {
        TextNode tn = new TextNode("test text");
        assertFalse(tn.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("test text");
        TextNode tnSplit = tn.splitText(4);
        assertEquals("test", tn.getWholeText());
        assertEquals(" text", tnSplit.getWholeText());
    }

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("test text");
        TextNode tnClone = tn.clone();
        assertEquals(tn.text(), tnClone.text());
        assertNotSame(tn, tnClone);
    }

    @Test
    public void createFromEncodedTest() {
        TextNode tn = TextNode.createFromEncoded("test&amp;text");
        assertEquals("test&text", tn.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = TextNode.normaliseWhitespace("test    text");
        assertEquals("test text", text);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = TextNode.stripLeadingWhitespace("  test text");
        assertEquals("test text", text);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("test ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void lastCharIsNotWhitespaceTest() {
        StringBuilder sb = new StringBuilder("test");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode tn = new TextNode("test text");
        StringBuilder sb = new StringBuilder();
        tn.outerHtmlHead(sb, 0, new Document("").outputSettings());
        assertEquals("test text", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode tn = new TextNode("test text");
        StringBuilder sb = new StringBuilder();
        tn.outerHtmlTail(sb, 0, new Document("").outputSettings());
        assertEquals("", sb.toString());
    }

    @Test
    public void toStringTest() {
        TextNode tn = new TextNode("test text");
        assertEquals("test text", tn.toString());
    }

}