package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void text_ValidText_Test() {
        TextNode textNode = new TextNode("testText");
        Assert.assertEquals("testText", textNode.text());
    }

    @Test
    public void nodeName_ValidText_Test() {
        TextNode textNode = new TextNode("testText");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void splitText_ValidOffset_Test() {
        TextNode textNode = new TextNode("testText");
        TextNode splittedTextNode = textNode.splitText(4);
        Assert.assertEquals("test", splittedTextNode.getWholeText());
    }

    @Test
    public void isBlank_EmptyString_Test() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_NonEmptyString_Test() {
        TextNode textNode = new TextNode("testText");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void clone_Test() {
        TextNode textNode = new TextNode("testText");
        TextNode clonedTextNode = textNode.clone();
        Assert.assertEquals(textNode.text(), clonedTextNode.text());
    }

    @Test
    public void createFromEncoded_ValidEncodedText_Test() {
        TextNode textNode = TextNode.createFromEncoded("testText");
        Assert.assertEquals("testText", textNode.text());
    }

    @Test
    public void outerHtmlHead_Basic_Test() {
        TextNode textNode = new TextNode("testText");
        final StringBuilder builder = new StringBuilder();
        try {
            textNode.outerHtmlHead(builder, 0, new Document.OutputSettings());
        } catch (IOException e) {
            Assert.fail("Exception thrown: " + e.getMessage());
        }
        Assert.assertEquals("testText", builder.toString());
    }

    @Test
    public void toString_Basic_Test() {
        TextNode textNode = new TextNode("testText");
        Assert.assertEquals("testText", textNode.toString());
    }

    @Test
    public void normaliseWhitespace_Basic_Test() {
        String normalisedString = TextNode.normaliseWhitespace("   This is a    test       ");
        Assert.assertEquals("This is a test", normalisedString);
    }

    @Test
    public void stripLeadingWhitespace_Basic_Test() {
        String strippedString = TextNode.stripLeadingWhitespace("    This is a test");
        Assert.assertEquals("This is a test", strippedString);
    }

    @Test
    public void lastCharIsWhitespace_Basic_Test() {
        boolean lastCharIsWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("This is a test "));
        Assert.assertTrue(lastCharIsWhitespace);
    }

    @Test
    public void lastCharIsWhitespace_NoWhitespace_Basic_Test() {
        boolean lastCharIsWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("This is a test"));
        Assert.assertFalse(lastCharIsWhitespace);
    }

}