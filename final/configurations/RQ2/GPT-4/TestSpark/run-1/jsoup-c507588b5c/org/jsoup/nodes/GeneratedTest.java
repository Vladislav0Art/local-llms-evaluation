package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("Test", textNode.text());
    }

    @Test
    public void setTextTest() {
        TextNode textNode = new TextNode("Test");
        textNode.text("New Test");
        Assert.assertEquals("New Test", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("Test", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test");
        TextNode splitNode = textNode.splitText(2);
        Assert.assertEquals("Te", splitNode.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        textNode.outerHtmlHead(accum, 0, out);
        Assert.assertEquals("Test", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        textNode.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("Test", textNode.toString());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Test");
        TextNode cloneNode = textNode.clone();
        Assert.assertNotSame(textNode, cloneNode);
        Assert.assertEquals(textNode.text(), cloneNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Test");
        Assert.assertEquals("Test", textNode.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String result = TextNode.normaliseWhitespace("  Test  ");
        Assert.assertEquals(" Test ", result);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String result = TextNode.stripLeadingWhitespace("  Test");
        Assert.assertEquals("Test", result);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("Test "));
        Assert.assertTrue(result);
    }

}