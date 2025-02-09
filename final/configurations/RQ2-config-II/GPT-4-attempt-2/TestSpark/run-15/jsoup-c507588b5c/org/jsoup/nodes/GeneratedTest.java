package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Test Node");
        Assert.assertEquals("Test Node", textNode.text());
    }

    @Test
    public void setTextTest() {
        TextNode textNode = new TextNode("Test");
        textNode.text("New Test");
        Assert.assertEquals("New Test", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Test Node");
        Assert.assertEquals("Test Node", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void isNotBlankTest() {
        TextNode textNode = new TextNode("Not Blank");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("This is TextNode. Split it");
        TextNode splitNode = textNode.splitText(10);
        Assert.assertEquals("TextNode. Split it", splitNode.getWholeText());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Original Node");
        TextNode clonedNode = textNode.clone();
        Assert.assertNotSame(textNode, clonedNode);
        Assert.assertEquals(textNode.text(), clonedNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        String encodedText = "<test>Test Node</test>";
        TextNode textNode = TextNode.createFromEncoded(encodedText, true);
        Assert.assertEquals("<test>Test Node</test>", textNode.getWholeText());
    }

    @Test
    public void normaliseWhiteSpaceTest() {
        String text = " This   is a    test ";
        String normalizedText = TextNode.normaliseWhitespace(text);
        Assert.assertEquals(" This is a test ", normalizedText);
    }

    @Test
    public void stripLeadingWhiteSpaceTest() {
        String text = "     Leading whitespace";
        String strippedText = TextNode.stripLeadingWhitespace(text);
        Assert.assertEquals("Leading whitespace", strippedText);
    }

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        StringBuilder stringBuilder = new StringBuilder("Whitespace at end ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(stringBuilder));
    }

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        StringBuilder stringBuilder = new StringBuilder("No whitespace at end.");
        Assert.assertFalse(TextNode.lastCharIsWhitespace(stringBuilder));
    }

}