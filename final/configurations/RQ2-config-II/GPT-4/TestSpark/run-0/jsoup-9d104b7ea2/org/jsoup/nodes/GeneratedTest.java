package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        String text = "test text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.text());
    }

    @Test
    public void NodeNameTest() {
        TextNode textNode = new TextNode("");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void TextTest() {
        String text = "new text";
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
    public void GetWholeTextTest() {
        String text = "whole text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void SplitTextTest() {
        String text = "test text";
        TextNode textNode = new TextNode(text);
        TextNode splitTextNode = textNode.splitText(4);
        Assert.assertEquals("test", textNode.text());
        Assert.assertEquals(" text", splitTextNode.text());
    }

    @Test
    public void OuterHtmlHeadTest() throws IOException {
        String text = "test text";
        TextNode textNode = new TextNode(text);
        StringBuilder stringBuilder = new StringBuilder();
        textNode.outerHtmlHead(stringBuilder, 0, new Document.OutputSettings());
        Assert.assertEquals(text, stringBuilder.toString());
    }

    @Test
    public void OuterHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("");
        StringBuilder stringBuilder = new StringBuilder();
        textNode.outerHtmlTail(stringBuilder, 0, new Document.OutputSettings());
        Assert.assertEquals("", stringBuilder.toString());
    }

    @Test
    public void ToStringTest() {
        String text = "test text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.toString());
    }

    @Test
    public void CloneTest() {
        TextNode textNode = new TextNode("test text");
        TextNode clonedTextNode = textNode.clone();
        Assert.assertNotEquals(textNode, clonedTextNode);
        Assert.assertEquals(textNode.text(), clonedTextNode.text());
    }

    @Test
    public void CreateFromEncodedTest() {
        String encodedText = "test&amp;text";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        Assert.assertEquals("test&text", textNode.text());
    }

}