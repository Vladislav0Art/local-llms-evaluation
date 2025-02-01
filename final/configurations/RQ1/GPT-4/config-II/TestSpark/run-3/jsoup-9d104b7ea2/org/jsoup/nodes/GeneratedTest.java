package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode node = new TextNode("some text");
        assertEquals("some text", node.getWholeText());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("some text");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode("  some text  ");
        assertEquals("some text", node.text());
    }

    @Test
    public void textSetterGetterTest() {
        TextNode node = new TextNode("  some text  ");
        node.text("new text");
        assertEquals("new text", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("  some text  ");
        assertEquals("  some text  ", node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("  ");
        assertTrue(node.isBlank());
        node.text("new text");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("123456");
        TextNode splitted = node.splitText(3);
        assertEquals("123", node.getWholeText());
        assertEquals("456", splitted.getWholeText());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("some text");
        TextNode cloned = node.clone();
        assertEquals(node.getWholeText(), cloned.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("&lt;");
        assertEquals("<", node.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        assertEquals("test text", TextNode.normaliseWhitespace("  test   text  "));
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        assertEquals("test text", TextNode.stripLeadingWhitespace("   test text"));
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("test text ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        sb.deleteCharAt(sb.length() - 1);
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}