package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    // Tests for TextNode(String text)

    @Test
    public void TextNodeConstructorTest() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        Assert.assertEquals(text, node.text());
    }

    @Test
    public void TextNodeConstructorWithNullTest() {
        new TextNode(null);
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("test");
        Assert.assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode("Test string.");
        Assert.assertEquals("Test string.", node.text());
    }

    @Test
    public void textSetterTest() {
        TextNode node = new TextNode("Old text.");
        node.text("New text.");
        Assert.assertEquals("New text.", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("Hello, World!");
        Assert.assertEquals("Hello, World!", node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode nonEmptyNode = new TextNode("Hello, World!");
        Assert.assertFalse(nonEmptyNode.isBlank());

        TextNode emptyNode = new TextNode("");
        Assert.assertTrue(emptyNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        String initialText = "Hello, World!";
        TextNode node = new TextNode(initialText);
        TextNode splitNode = node.splitText(7);
        Assert.assertEquals("Hello, ", node.text());
        Assert.assertEquals("World!", splitNode.text());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Hello, World!");
        TextNode cloneNode = node.clone();
        Assert.assertEquals(node.text(), cloneNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("Hello, World!");
        Assert.assertEquals("Hello, World!", node.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String result = TextNode.normaliseWhitespace("Hello,     World!");
        Assert.assertEquals("Hello, World!", result);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String result = TextNode.stripLeadingWhitespace("     Hello, World!");
        Assert.assertEquals("Hello, World!", result);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, World! ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(sb));

        sb = new StringBuilder();
        sb.append("Hello, World!");
        Assert.assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}