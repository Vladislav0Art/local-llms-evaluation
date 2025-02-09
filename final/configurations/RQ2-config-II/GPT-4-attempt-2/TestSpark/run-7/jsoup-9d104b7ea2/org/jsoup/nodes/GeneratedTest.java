package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        TextNode textNode = new TextNode("test");
        Assert.assertNotNull(textNode);
        Assert.assertEquals("test", textNode.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("test", textNode.text());
    }

    @Test
    public void textSetTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("new test");
        Assert.assertEquals("new test", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("getWholeText");
        Assert.assertEquals("getWholeText", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode(" ");
        Assert.assertTrue(textNode.isBlank());
        TextNode nonBlankTextNode = new TextNode("test");
        Assert.assertFalse(nonBlankTextNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("splitText");
        TextNode split = textNode.splitText(4);
        Assert.assertEquals("split", textNode.getWholeText());
        Assert.assertEquals("Text", split.getWholeText());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("outerHtmlHead");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new Document.OutputSettings());
        Assert.assertTrue(accum.toString().contains("outerHtmlHead"));
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("outerHtmlTail");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, new Document.OutputSettings());
        Assert.assertTrue(accum.toString().contains(""));
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("toString");
        Assert.assertTrue(textNode.toString().contains("toString"));
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("clone");
        TextNode clone = textNode.clone();
        Assert.assertNotSame(textNode, clone);
        Assert.assertEquals(textNode.text(), clone.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("createFromEncoded", true);
        Assert.assertEquals("createFromEncoded", textNode.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String result = TextNode.normaliseWhitespace("    normalise   whitespace test");
        Assert.assertEquals(" normalise whitespace test", result);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String result = TextNode.stripLeadingWhitespace("    stripLeadingWhitespace test");
        Assert.assertEquals("stripLeadingWhitespace test", result);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("lastCharIsWhitespace "));
        Assert.assertTrue(result);
        result = TextNode.lastCharIsWhitespace(new StringBuilder("lastCharIsWhitespace"));
        Assert.assertFalse(result);
    }

}