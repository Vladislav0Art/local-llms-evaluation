package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newNodeTextTest() throws IOException {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

    @Test
    public void newNodeTextWithBlankTest() throws IOException {
        TextNode node = new TextNode("   ");
        assertTrue(node.isBlank());
    }

    @Test
    public void newNodeTextSplitTest() throws IOException {
        TextNode node = new TextNode("Hello World");
        TextNode split = node.splitText(6);
        assertEquals("World", split.text());
    }

    @Test
    public void cloneTextNodeTest() {
        TextNode node = new TextNode("Hello World");
        TextNode clone = node.clone();
        assertNotNull(clone);
        assertTrue(node.isSameNode(clone));
    }

    @Test
    public void normaliseWhitespaceTest() {
        assertEquals("Hello World", StringUtil.normaliseWhitespace("   Hello World  "));
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        assertEquals("Hello World", StringUtil.stripLeadingWhitespace("  Hello World"));
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        assertTrue(StringBuilderUtil.lastCharIsWhitespace(new StringBuilder(" ")));
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("Hello World");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void getWholeTextTest() throws IOException {
        TextNode node = new TextNode("Hello\nWorld");
        assertEquals("Hello\nWorld", node.getWholeText());
    }

}