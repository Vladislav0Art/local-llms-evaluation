package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("");
        assertEquals(false, node.isBlank());
    }

    @Test
    public void testSplitTextNoOffset() {
        TextNode node = new TextNode("Hello World");
        assertEquals(node, node.splitText(0));
    }

    @Test
    public void testSplitTextWithOffset_1() {
        TextNode node = new TextNode("Hello World");
        assertEquals(new TextNode("<p> Hello  <br> World</p>"), node.splitText(1));
    }

    @Test
    public void testSplitTextWithOffset_2() {
        TextNode node = new TextNode("Hello World");
        assertEquals(new TextNode("<p> <b>Hello</b> <span>World</span></p>"), node.splitText(3));
    }

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("<html><body>Hello World!</body></html>");
        assertEquals(node.getText(), "Hello World!");
    }

    @Test
    public void testGetWholeTextBlankLine() {
        TextNode node = new TextNode("\n\nHello World!\n\n");
        assertEquals(node.getText(), "");
    }

}