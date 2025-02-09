package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedTest {

    @Test
    public void newNodeTextTest() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.text());
    }

    @Test
    public void emptyTextNodeTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Hello World");
        TextNode result1 = (TextNode) node.splitText(5);
        assertEquals("World", result1.text());
        assertEquals("Hello", ((TextNode) node).text());
    }

    @Test
    public void cloneTextNodeTest() {
        TextNode node = new TextNode("Hello");
        TextNode clone = node.clone();
        assertEquals(node, clone);
    }

    @Test
    public void createFromEncodedTextTest() {
        String encodedText = "Hello";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, node.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = "\t Hello ";
        assertTrue(TextNode.normaliseWhitespace(text).equals("   Hello "));
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = " \t Hello";
        assertEquals("Hello", TextNode.stripLeadingWhitespace(text));
    }

}