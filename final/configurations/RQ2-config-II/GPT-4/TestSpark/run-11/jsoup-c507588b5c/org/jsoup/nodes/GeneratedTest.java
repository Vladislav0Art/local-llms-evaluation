package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void parentNodeConstructorTest() {
        TextNode textNode = new TextNode("Hello, world!");
        Assert.assertNotNull(textNode);
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Hello, world!");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Hello, world!");
        Assert.assertEquals("Hello, world!", textNode.text());
    }

    @Test
    public void textChangeTest() {
        TextNode textNode = new TextNode("Hello, world!");
        textNode.text("New text");
        Assert.assertEquals("New text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Hello, world!");
        Assert.assertEquals("Hello, world!", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        Assert.assertEquals(true, textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello, world!");
        TextNode splitTextNode = textNode.splitText(6);
        Assert.assertEquals("world!", splitTextNode.getWholeText());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Hello, world!");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, 0, out);
        Assert.assertEquals("Hello, world!", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("Hello, world!");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Hello, world!");
        Assert.assertEquals("Hello, world!", textNode.toString());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Hello, world!");
        TextNode cloneTextNode = textNode.clone();
        Assert.assertEquals(cloneTextNode.text(), textNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Hello, world!", false);
        Assert.assertEquals("Hello, world!", textNode.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String result = TextNode.normaliseWhitespace("\t Hello, world!");
        Assert.assertEquals(" Hello, world!", result);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String result = TextNode.stripLeadingWhitespace(" Hello, world!");
        Assert.assertEquals("Hello, world!", result);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("Hello, world! "));
        Assert.assertEquals(true, result);
    }

}