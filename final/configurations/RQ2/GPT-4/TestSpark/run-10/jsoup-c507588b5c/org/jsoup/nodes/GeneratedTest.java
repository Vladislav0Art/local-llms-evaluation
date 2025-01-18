package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void textNodeTextTest() {
        TextNode textNode = new TextNode("Hello");
        Assert.assertEquals("Hello", textNode.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Hello");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textNewValueTest() {
        TextNode textNode = new TextNode("Hello");
        textNode.text("Hi");
        Assert.assertEquals("Hi", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Hello");
        Assert.assertEquals("Hello", textNode.getWholeText());
    }

    @Test
    public void isBlankTrueTest() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankFalseTest() {
        TextNode textNode = new TextNode("Hello");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello World");
        TextNode splittedNode = textNode.splitText(6);
        Assert.assertEquals("World", splittedNode.text());
    }

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("Hello");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        try {
            textNode.outerHtmlHead(sb, 0, outputSettings);
            Assert.assertEquals("Hello", sb.toString());
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Hello");
        Assert.assertEquals("Hello", textNode.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String normalized = TextNode.normaliseWhitespace(" Hello    World   ");
        Assert.assertEquals("Hello World", normalized);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String stripped = TextNode.stripLeadingWhitespace("    Hello World");
        Assert.assertEquals("Hello World", stripped);
    }

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        StringBuilder sb = new StringBuilder("Hello ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        StringBuilder sb = new StringBuilder("Hello");
        Assert.assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}