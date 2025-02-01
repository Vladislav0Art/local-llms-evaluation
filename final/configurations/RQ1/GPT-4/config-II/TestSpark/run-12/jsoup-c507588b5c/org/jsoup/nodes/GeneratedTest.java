package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Hello, world!");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("  Hello,     world!  ");
        Assert.assertEquals("Hello, world!", textNode.text());
    }

    @Test
    public void textSetTest() {
        TextNode textNode = new TextNode("");
        textNode.text("Hello, world!");
        Assert.assertEquals("Hello, world!", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("  Hello,     world!  ");
        Assert.assertEquals("  Hello,     world!  ", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());

        textNode = new TextNode("   ");
        Assert.assertTrue(textNode.isBlank());

        textNode = new TextNode("Hello, world!");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello, world!");
        TextNode splitNode = textNode.splitText(7);

        Assert.assertEquals("Hello, ", textNode.getWholeText());
        Assert.assertEquals("world!", splitNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Hello, &lt;world&gt;!");
        Assert.assertEquals("Hello, <world>!", textNode.getWholeText());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Hello, world!");
        TextNode cloneNode = textNode.clone();

        Assert.assertNotSame(textNode, cloneNode);
        Assert.assertEquals(textNode.getWholeText(), cloneNode.getWholeText());
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Hello, world!");
        Assert.assertEquals("Hello, world!", textNode.toString());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("  Hello,     world!  ");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, 0, out);
        Assert.assertEquals("  Hello,     world!  ", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("Hello, world!");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

}