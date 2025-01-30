package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Sample Text");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textGetTest() {
        TextNode textNode = new TextNode(" Sample Text ");
        Assert.assertEquals("Sample Text", textNode.text());
    }

    @Test
    public void textSetTest() {
        TextNode textNode = new TextNode("Old Text");
        textNode.text("New Text");
        Assert.assertEquals("New Text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode(" Sample Text ");
        Assert.assertEquals(" Sample Text ", textNode.getWholeText());
    }

    @Test
    public void isBlankTrueTest() {
        TextNode textNode = new TextNode("   ");
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankFalseTest() {
        TextNode textNode = new TextNode("Not empty");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        String oldText = "Old Text";
        TextNode textNode = new TextNode(oldText);
        TextNode tail = textNode.splitText(4);
        Assert.assertEquals("Old ", textNode.getWholeText());
        Assert.assertEquals("Text", tail.getWholeText());
    }

    @Test
    public void splitTextInvalidArgumentExceptionNegativeTest() {
        String oldText = "Old Text";
        TextNode textNode = new TextNode(oldText);
        textNode.splitText(-1);
    }

    @Test
    public void splitTextInvalidArgumentExceptionGreaterThanLengthTest() {
        String oldText = "Old Text";
        TextNode textNode = new TextNode(oldText);
        textNode.splitText(oldText.length() + 1);
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Sample");
        StringBuilder out = new StringBuilder();
        textNode.outerHtmlHead(out, 0, new Document("Test").outputSettings());
        Assert.assertEquals("Sample", out.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("Sample");
        StringBuilder out = new StringBuilder();
        textNode.outerHtmlTail(out, 0, new Document("Test").outputSettings());
        Assert.assertEquals("", out.toString());
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("ToString Test");
        Assert.assertEquals("ToString Test", textNode.toString());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Clone Test");
        Assert.assertEquals(textNode, textNode.clone());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode createdTextNode = TextNode.createFromEncoded("&lt;div&gt;Sample Text&lt;/div&gt;");
        Assert.assertEquals("<div>Sample Text</div>", createdTextNode.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String normalisedText = TextNode.normaliseWhitespace(" Normalise  Whitespace ");
        Assert.assertEquals("Normalise Whitespace", normalisedText);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String strippedText = TextNode.stripLeadingWhitespace("   Leading whitespace");
        Assert.assertEquals("Leading whitespace", strippedText);
    }

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        StringBuilder sb = new StringBuilder("Whitespace at end ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        StringBuilder sb = new StringBuilder("No whitespace at end");
        Assert.assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}