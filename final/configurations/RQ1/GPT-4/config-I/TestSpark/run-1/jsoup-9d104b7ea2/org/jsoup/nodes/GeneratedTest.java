package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textSetterAndGetterTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("Test", textNode.text());
        textNode.text("Setter test");
        Assert.assertEquals("Setter test", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("WholeText Test");
        Assert.assertEquals("WholeText Test", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());
        textNode.text("Not Blank");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("SplitTest");
        TextNode tailNode = textNode.splitText(5);
        Assert.assertEquals("Split", textNode.getWholeText());
        Assert.assertEquals("Test", tailNode.getWholeText());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode textNode = new TextNode("Test");
        textNode.splitText(-1);
    }

    @Test
    public void splitTextOffsetGreaterThanLengthTest() {
        TextNode textNode = new TextNode("Test");
        textNode.splitText(10);
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("CloneTest");
        TextNode clonedNode = textNode.clone();
        Assert.assertEquals(clonedNode.getWholeText(), textNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;Test&gt;");
        Assert.assertEquals("<Test>", textNode.getWholeText());
    }

    @Test
    public void normaliseWhitespaceStaticMethodTest() {
        String normalizedText = TextNode.normaliseWhitespace(" Normalize    Whitespace ");
        Assert.assertEquals("Normalize Whitespace", normalizedText);
    }

    @Test
    public void stripLeadingWhitespaceStaticMethodTest() {
        String strippedText = TextNode.stripLeadingWhitespace("    Strip leading whitespace");
        Assert.assertEquals("Strip leading whitespace", strippedText);
    }

    @Test
    public void lastCharIsWhitespaceStaticMethodTest() {
        StringBuilder builder = new StringBuilder("Last char is whitespace ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(builder));
        builder = new StringBuilder("No trailing whitespace");
        Assert.assertFalse(TextNode.lastCharIsWhitespace(builder));
    }

}