package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("abc");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode("abc");
        assertEquals("abc", node.text());
    }

    @Test
    public void textSetTextTest() {
        TextNode node = new TextNode("abc");
        node.text("xyz");
        assertEquals("xyz", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("abc");
        assertEquals("abc", node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode(" ");
        assertTrue(node.isBlank());

        node = new TextNode("xyz");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("hello");
        TextNode secondPart = node.splitText(2);
        assertEquals("hel", node.getWholeText());
        assertEquals("lo", secondPart.getWholeText());
    }

    @Test
    public void outerHtmlHeadAndTailTest() throws IOException {
        TextNode node = new TextNode("hello");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings mockSettings = mock(Document.OutputSettings.class);

        node.outerHtmlHead(sb, 0, mockSettings);
        node.outerHtmlTail(sb, 0, mockSettings);
        assertEquals("hello", sb.toString());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("hello");
        TextNode clonedNode = node.clone();
        assertNotSame(node, clonedNode);
        assertEquals(node.getWholeText(), clonedNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("a&amp;b");
        assertEquals("a&b", node.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String normalized = TextNode.normaliseWhitespace(" ab  c   ");
        assertEquals(" ab c ", normalized);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String stripped = TextNode.stripLeadingWhitespace("   abc");
        assertEquals("abc", stripped);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("abc ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));

        sb = new StringBuilder("abc");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}