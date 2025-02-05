package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("Test", textNode.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textGetterAndSetterTest() {
        TextNode textNode = new TextNode("Test");
        textNode.text("Changed");
        Assert.assertEquals("Changed", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("Test", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("  ");
        Assert.assertEquals(true, textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test split");
        TextNode splitNode = textNode.splitText(5);
        Assert.assertEquals("split", splitNode.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, new Document.OutputSettings());
        Assert.assertEquals("Test", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("Test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlTail(sb, 0, new Document.OutputSettings());
        Assert.assertEquals("", sb.toString());
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("Test", textNode.toString());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Test");
        TextNode clonedNode = textNode.clone();
        Assert.assertEquals(textNode.text(), clonedNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Test", true);
        Assert.assertEquals("Test", textNode.text());
    }

    @Test
    public void normaliseWhitespaceTextTest() {
        String normalizedText = TextNode.normaliseWhitespace(" Test ");
        Assert.assertEquals(" Test", normalizedText);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String strippedText = TextNode.stripLeadingWhitespace(" Test");
        Assert.assertEquals("Test", strippedText);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean isLastWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("Test "));
        Assert.assertTrue(isLastWhitespace);
    }

}