package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void textGetSetTest() {
        TextNode textNode = new TextNode("Initial");
        Assert.assertEquals("Initial", textNode.text());

        textNode.text("Updated");
        Assert.assertEquals("Updated", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("WholeText");
        Assert.assertEquals("WholeText", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());

        textNode.text("Not empty");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("SplitMe");
        TextNode newText = textNode.splitText(5);

        Assert.assertEquals("Split", textNode.getWholeText());
        Assert.assertEquals("Me", newText.getWholeText());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        new TextNode("SplitMe").splitText(-1);
    }

    @Test
    public void splitTextExcessiveOffsetTest() {
        new TextNode("SplitMe").splitText(100);
    }

    @Test
    public void outerHtmlTest() {
        TextNode textNode = new TextNode("<div>Hello, World!</div>");
        Assert.assertEquals("<div>Hello, World!</div>", textNode.toString());
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("CloneMe");
        TextNode clone = textNode.clone();

        Assert.assertNotSame(textNode, clone);
        Assert.assertEquals(textNode.toString(), clone.toString());
    }

    @Test
    public void createFromEncodedTest() {
        String encodedText = "<div>Hello, World!</div>";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        Assert.assertEquals("<div>Hello, World!</div>", textNode.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = "   This   is   a   sentence.  ";
        String result = TextNode.normaliseWhitespace(text);

        Assert.assertEquals("This is a sentence.", result);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "   Leading whitespace";
        String result = TextNode.stripLeadingWhitespace(text);

        Assert.assertEquals("Leading whitespace", result);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("With whitespace ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(sb));

        sb.deleteCharAt(sb.length() - 1);
        Assert.assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}