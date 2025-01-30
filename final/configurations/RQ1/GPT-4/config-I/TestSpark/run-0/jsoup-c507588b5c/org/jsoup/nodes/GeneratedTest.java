package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.TextNode;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("Test", textNode.getWholeText());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void getTextTest() {
        TextNode textNode = new TextNode("  Test  ");
        Assert.assertEquals("Test", textNode.text());
    }

    @Test
    public void setTextTest() {
        TextNode textNode = new TextNode("Test");
        textNode.text("Changed");
        Assert.assertEquals("Changed", textNode.getWholeText());
    }

    @Test
    public void isBlankTrueTest() {
        TextNode textNode = new TextNode(" ");
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankFalseTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test");
        TextNode tailNode = textNode.splitText(2);
        Assert.assertEquals("Te", textNode.getWholeText());
        Assert.assertEquals("st", tailNode.getWholeText());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode textNode = new TextNode("Test");
        textNode.splitText(-1);
    }

    @Test
    public void splitTextExceedLengthOffsetTest() {
        TextNode textNode = new TextNode("Test");
        textNode.splitText(5);
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&amp;amp;");
        Assert.assertEquals("&amp;", textNode.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String result = TextNode.normaliseWhitespace("  Test  ");
        Assert.assertEquals("Test", result);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String result = TextNode.stripLeadingWhitespace("  Test");
        Assert.assertEquals("Test", result);
    }

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("Test "));
        Assert.assertTrue(result);
    }

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("Test"));
        Assert.assertFalse(result);
    }

}