package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void TextNodeCreationTest() {
        TextNode node = new TextNode("content");
        assertEquals("content", node.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("content");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textSetterTest() {
        TextNode node = new TextNode("content");
        node.text("new content");
        assertEquals("new content", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("content");
        assertEquals("content", node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void isNotBlankTest() {
        TextNode node = new TextNode("content");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitTextNodeTest() {
        TextNode node = new TextNode("content");
        TextNode split = node.splitText(2);
        assertEquals("ntent", split.text());
        assertEquals("co", node.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("content");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("content", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        TextNode node = new TextNode("content");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertEquals("", accum.toString());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("content");
        TextNode cloned = node.clone();
        assertEquals(node.text(), cloned.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("content");
        assertEquals("content", node.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String normalised = TextNode.normaliseWhitespace("hello   world");
        assertEquals("hello world", normalised);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String stripped = TextNode.stripLeadingWhitespace("   hello world");
        assertEquals("hello world", stripped);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("hello "));
        assertTrue(result);
    }

}