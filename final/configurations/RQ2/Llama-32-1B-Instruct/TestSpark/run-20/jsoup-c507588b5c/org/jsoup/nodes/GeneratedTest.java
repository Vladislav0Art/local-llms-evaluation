package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeName_test() {
        TextNode node = new TextNode("Hello World");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void text_test() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
        assertEquals("", node.text(null));
        assertEquals("World", node.text(new String[]{}));
    }

    @Test
    public void getWholeText_test() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.getWholeText());
        assertEquals(null, node.getWholeText(""));
        assertEquals(0, node.getWholeText("").length());
    }

    @Test
    public void isBlank_test() {
        TextNode node = new TextNode("Hello World");
        assertTrue(node.isBlank());
        assertFalse(node.isBlank(null));
        assertFalse(node.isBlank(""));
    }

    @Test
    public void splitText_test() {
        TextNode node = new TextNode("Hello World");
        assertEquals(2, node.splitText(0));
        assertEquals(4, node.splitText(-1));
        assertEquals(3, node.splitText(10));
        assertEquals(5, node.splitText(20));
    }

    @Test
    public void outerHtmlHead_test() {
        TextNode node = new TextNode("Hello World");
        assertTrue(node.outerHtmlHead(new Appendable(), 0, null).trim().contains("Hello"));
        assertFalse(node.outerHtmlHead(null, 0, null).trim().contains("Hello"));
    }

    @Test
    public void outerHtmlTail_test() {
        TextNode node = new TextNode("Hello World");
        assertTrue(node.outerHtmlTail(new Appendable(), 0, null).trim().isEmpty());
        assertFalse(node.outerHtmlTail(null, 0, null).trim().isEmpty());
    }

    @Test
    public void toString_test() {
        TextNode node = new TextNode("Hello World");
        assertEquals("<text>Hello World</text>", node.toString());
    }

    @Test
    public void clone_test() {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = (TextNode) node1.clone();
        assertEquals(node1, node2);
    }

    @Test
    public void createFromEncoded_test() {
        String encodedText = "Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals("Hello World", node.text());
    }

    @Test
    public void normaliseWhitespace_test() {
        assertTrue(TextNode.normaliseWhitespace("   Hello   World  "));
        assertTrue(TextNode.normaliseWhitespace("World"));
    }

    @Test
    public void stripLeadingWhitespace_test() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World");
        assertEquals(6, sb.toString().length());
        sb.setLength(0);
        assertEquals(5, sb.toString().length());
    }

    @Test
    public void lastCharIsWhitespace_test() {
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder()));
        assertFalse(TextNode.lastCharIsWhitespace("Hello World"));
    }

}