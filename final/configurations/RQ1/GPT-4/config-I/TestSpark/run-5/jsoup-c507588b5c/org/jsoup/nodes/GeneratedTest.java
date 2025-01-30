package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        Assert.assertEquals(text, node.getWholeText());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("");
        Assert.assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        Assert.assertEquals(text, node.text());
    }

    @Test
    public void changeTextTest() {
        String text = "test";
        TextNode node = new TextNode("");
        node.text(text);
        Assert.assertEquals(text, node.text());
    }

    @Test
    public void getWholeTextTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        Assert.assertEquals(text, node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        String text = "    ";
        TextNode node = new TextNode(text);
        Assert.assertTrue(node.isBlank());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        node.splitText(-1);
    }

    @Test
    public void splitTextGreaterThanLengthTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        node.splitText(text.length() + 1);
    }

    @Test
    public void splitTextNodeTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        TextNode newTextNode = node.splitText(2);
        Assert.assertEquals("te", node.getWholeText());
        Assert.assertEquals("st", newTextNode.getWholeText());
    }

    @Test
    public void cloneTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        TextNode cloneNode = node.clone();
        Assert.assertNotSame(node, cloneNode);
        Assert.assertEquals(node.getWholeText(), cloneNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        Assert.assertEquals("<", node.getWholeText());
    }

}