package org.jsoup.nodes;

import org.jsoup.nodes.Document;
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
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void textSetTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("new test");
        assertEquals("new test", textNode.text());
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
        TextNode emptyNode = new TextNode("");
        assertTrue(emptyNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode splitNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", splitNode.getWholeText());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 1, new Document("").outputSettings());
        assertEquals("test", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlTail(sb, 1, new Document("").outputSettings());
        assertEquals("", sb.toString());
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("test");
        assertTrue(textNode.toString().startsWith("org.jsoup.nodes.TextNode"));
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("test");
        TextNode cloneNode = textNode.clone();
        assertEquals(textNode.getWholeText(), cloneNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String input = "    Hello    World  ";
        String normalized = TextNode.normaliseWhitespace(input);
        assertEquals("Hello World", normalized);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String input = "    Hello World";
        String stripped = TextNode.stripLeadingWhitespace(input);
        assertEquals("Hello World", stripped);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("test ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        sb = new StringBuilder("test");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}