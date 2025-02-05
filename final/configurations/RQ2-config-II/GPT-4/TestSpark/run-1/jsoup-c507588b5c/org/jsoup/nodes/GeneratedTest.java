package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        String text = "TextNode Test";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.text());
    }

    @Test
    public void setTextTest() {
        String text = "New TextNode Test";
        TextNode textNode = new TextNode("");
        textNode.text(text);
        Assert.assertEquals(text, textNode.text());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        String text = "Split TextNode Test";
        TextNode textNode = new TextNode(text);
        TextNode splitNode = textNode.splitText(7);
        Assert.assertEquals("TextNode", splitNode.text());
    }

    @Test
    public void toStringTest() {
        String text = "ToString Test";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.toString());
    }

    @Test
    public void cloneTest() {
        String text = "Clone Test";
        TextNode textNode = new TextNode(text);
        TextNode clonedNode = textNode.clone();
        Assert.assertNotSame(textNode, clonedNode);
        Assert.assertEquals(textNode.text(), clonedNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        String encodedText = "Encoded &#x26; Test";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        Assert.assertEquals("Encoded and Test", textNode.text());
    }

}