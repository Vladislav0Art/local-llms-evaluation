package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void constructorBasicTest() {
        TextNode node = new TextNode("test text");
        assertNotNull(node);
        assertEquals("test text", node.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textBasicTest() {
        TextNode node = new TextNode("test text");
        assertEquals("test text", node.text());
    }

    @Test
    public void setTextTest() {
        TextNode node = new TextNode("old text");
        node.text("new text");
        assertEquals("new text", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("whole text");
        assertEquals("whole text", node.getWholeText());
    }

    @Test
    public void isBlankTrueTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlankFalseTest() {
        TextNode node = new TextNode("not blank");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("split this text");
        TextNode splitNode = node.splitText(5);
        assertEquals("split", node.text());
        assertEquals(" this text", splitNode.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("outer text");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        node.outerHtmlHead(sb, 0, settings);
        assertEquals("outer text", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode node = new TextNode("text");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        node.outerHtmlTail(sb, 0, settings);
        assertEquals("", sb.toString());
    }

    @Test
    public void toStringTest() {
        TextNode node = new TextNode("outer text");
        assertEquals("outer text", node.toString());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("test text");
        TextNode clonedNode = node.clone();
        assertNotSame(node, clonedNode);
        assertEquals(node.text(), clonedNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("test encoded text");
        assertNotNull(node);
        assertEquals("test encoded text", node.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String result = TextNode.normaliseWhitespace("   normalize     this     ");
        assertNotNull(result);
        assertEquals(" normalize this ", result);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String result = TextNode.stripLeadingWhitespace("    strip this");
        assertNotNull(result);
        assertEquals("strip this", result);
    }

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("trailing space "));
        assertTrue(result);
    }

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("no trailing space"));
        assertFalse(result);
    }

}