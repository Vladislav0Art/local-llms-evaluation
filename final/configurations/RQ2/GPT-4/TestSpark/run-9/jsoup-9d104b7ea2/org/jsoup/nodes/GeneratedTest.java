package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        TextNode textNode = new TextNode("Sample Text");
        Assert.assertEquals("Sample Text", textNode.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Sample Text");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Sample Text");
        textNode.text("Modified Text");
        Assert.assertEquals("Modified Text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Sample Text");
        Assert.assertEquals("Sample Text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode(" ");
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Sample Text");
        TextNode resultNode = textNode.splitText(6);
        Assert.assertEquals("Sample", textNode.text());
        Assert.assertEquals("Text", resultNode.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Sample Text");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 1, new Document.OutputSettings());
        Assert.assertEquals("Sample Text", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("Sample Text");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 1, new Document.OutputSettings());
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Sample Text");
        String toString = textNode.toString();
        Assert.assertTrue(toString.contains("Sample Text"));
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Sample Text");
        TextNode cloneNode = textNode.clone();
        Assert.assertEquals(textNode.text(), cloneNode.text());
    }

}