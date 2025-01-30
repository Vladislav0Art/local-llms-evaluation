package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.*;

import static org.junit.Assert.*;

public class GeneratedTest {


    // Test for normaliseWhitespace()

    @Test
    public void normaliseWhitespaceTest() {
        String text = "    This is     a text     ";
        assertEquals("This is a text", TextNode.normaliseWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "    This is     a text     ";
        assertEquals("This is     a text     ", TextNode.stripLeadingWhitespace(text));
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("This is a text ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;&gt;");
        assertEquals("<>", textNode.text());
    }

    @Test
    public void cloneTest() {
        TextNode textNode1 = new TextNode("This is a text");
        TextNode textNode2 = textNode1.clone();
        assertEquals(textNode1.text(), textNode2.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("This is a text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("This is     a text");
        assertEquals("This is a text", textNode.text());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("This is a text");
        TextNode splittedTextNode = textNode.splitText(4);
        assertEquals("This", textNode.text());
        assertEquals(" is a text", splittedTextNode.text());
    }

    @Test
    public void splitTextNegativeTest() {
        TextNode textNode = new TextNode("This is a text");
        textNode.splitText(-1);
    }

    @Test
    public void splitTextOverLengthTest() {
        TextNode textNode = new TextNode("This is a text");
        textNode.splitText(25);
    }

}