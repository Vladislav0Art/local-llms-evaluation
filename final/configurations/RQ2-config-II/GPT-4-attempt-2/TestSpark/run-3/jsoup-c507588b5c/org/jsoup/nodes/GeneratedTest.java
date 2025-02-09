package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void textNodeConstructorNormalTextTest() {
        TextNode tNode = new TextNode("Testing");
        Assert.assertEquals("Testing", tNode.text());
    }

    @Test
    public void nodeNameNormalTest() {
        TextNode tNode = new TextNode("");
        Assert.assertEquals("#text", tNode.nodeName());
    }

    @Test
    public void textGetNormalTest() {
        TextNode tNode = new TextNode("Testing text method");
        Assert.assertEquals("Testing text method", tNode.text());
    }

    @Test
    public void textSetNormalTest() {
        TextNode tNode = new TextNode("");
        tNode.text("New Text");
        Assert.assertEquals("New Text", tNode.text());
    }

    @Test
    public void getWholeTextNormalTest() {
        TextNode tNode = new TextNode("Whole text test");
        Assert.assertEquals("Whole text test", tNode.getWholeText());
    }

    @Test
    public void isBlankTrueTest() {
        TextNode tNode = new TextNode("   ");
        Assert.assertTrue(tNode.isBlank());
    }

    @Test
    public void isBlankFalseTest() {
        TextNode tNode = new TextNode("Not blank");
        Assert.assertFalse(tNode.isBlank());
    }

    @Test
    public void splitTextNormalTest() {
        TextNode tNode = new TextNode("12345");
        TextNode splitNode = tNode.splitText(2);
        Assert.assertEquals("12", splitNode.text());
    }

    @Test
    public void outerHtmlHeadNormalTest() throws IOException {
        TextNode tNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        tNode.outerHtmlHead(accum, 0, out);
        Assert.assertEquals("test", accum.toString());
    }

    @Test
    public void outerHtmlTailNormalTest() {
        TextNode tNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        tNode.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void cloneNormalTest() {
        TextNode tNode = new TextNode("test");
        TextNode cloneNode = tNode.clone();
        Assert.assertNotSame(tNode, cloneNode);
        Assert.assertEquals(tNode.text(), cloneNode.text());
    }

    @Test
    public void createFromEncodedNormalTest() {
        TextNode tNode = TextNode.createFromEncoded("test", true);
        Assert.assertEquals("test", tNode.text());
    }

    @Test
    public void normaliseWhitespaceNormalTest() {
        String text = TextNode.normaliseWhitespace("  spaced  text  ");
        Assert.assertNotEquals("  spaced  text  ", text);
        Assert.assertEquals(" spaced text ", text);
    }

    @Test
    public void stripLeadingWhitespaceNormalTest() {
        String text = TextNode.stripLeadingWhitespace("   leading spaces");
        Assert.assertEquals("leading spaces", text);
    }

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        Boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("Trailing space "));
        Assert.assertTrue(result);
    }

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        Boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("No trailing space"));
        Assert.assertFalse(result);
    }

}