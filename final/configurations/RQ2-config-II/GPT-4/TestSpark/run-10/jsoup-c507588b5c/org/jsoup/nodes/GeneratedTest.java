package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello, World!", node.text());
    }

    @Test
    public void textSetterTest() {
        TextNode node = new TextNode("");
        assertEquals("New Text", node.text("New Text").text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello, World!", node.getWholeText());
    }

    @Test
    public void isBlankTest_NotBlank() {
        TextNode node = new TextNode("Hello, World!");
        assertFalse(node.isBlank());
    }

    @Test
    public void isBlankTest_Blank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Hello, World!");
        TextNode clone = node.clone();
        assertNotSame(node, clone);
        assertEquals(node.text(), clone.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("Hello, World!");
        assertEquals("Hello, World!", node.text());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Hello, World!");
        node.splitText(5);
        assertEquals("Hello", node.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = "   Hello,  World!  ";
        assertEquals("Hello, World!", TextNode.normaliseWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "   Hello, World!";
        assertEquals("Hello, World!", TextNode.stripLeadingWhitespace(text));
    }

    @Test
    public void lastCharIsWhitespaceTest_True() {
        StringBuilder sb = new StringBuilder("Hello, World! ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void lastCharIsWhitespaceTest_False() {
        StringBuilder sb = new StringBuilder("Hello, World!");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}