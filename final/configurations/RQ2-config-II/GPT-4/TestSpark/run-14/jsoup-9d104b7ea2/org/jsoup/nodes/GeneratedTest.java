package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutlineTag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("test", textNode.text());
    }

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("newTest");
        Assert.assertEquals("newTest", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void isNotBlankTest() {
        TextNode textNode = new TextNode("test");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test Case");
        TextNode split = textNode.splitText(5);
        Assert.assertEquals("Test ", textNode.text());
        Assert.assertEquals("Case", split.text());
    }

    @Test
    public void splitTextInvalidOffsetTest() {
        TextNode textNode = new TextNode("Test Case");
        textNode.splitText(15);
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Test Case");
        TextNode clone = textNode.clone();
        Assert.assertNotEquals(System.identityHashCode(textNode), System.identityHashCode(clone));
        Assert.assertEquals(textNode.text(), clone.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Test Case", true);
        Assert.assertEquals("Test Case", textNode.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String normalisedWhiteSpace = TextNode.normaliseWhitespace("Test     Case");
        Assert.assertEquals("Test Case", normalisedWhiteSpace);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String strippedText = TextNode.stripLeadingWhitespace("    Test Case");
        Assert.assertEquals("Test Case", strippedText);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Test Case ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void lastCharIsNotWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Test Case");
        Assert.assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new Document.OutputSettings());
        Assert.assertEquals("Test", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, new Document.OutputSettings());
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("test", textNode.toString());
    }

}