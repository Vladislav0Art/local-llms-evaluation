package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("Test Node");
        Assert.assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode("Test Node");
        Assert.assertEquals("Test Node", node.text());
    }

    @Test
    public void setTextTest() {
        TextNode node = new TextNode("Initial Text");
        node.text("Updated Text");
        Assert.assertEquals("Updated Text", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("Whole Text");
        Assert.assertEquals("Whole Text", node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("");
        Assert.assertTrue(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Split Text");
        TextNode splitNode = node.splitText(5);
        Assert.assertEquals("Split", node.text());
        Assert.assertEquals(" Text", splitNode.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Document.OutputSettings outputSettings = new Document("").outputSettings();
        TextNode node = new TextNode("<div>Testing</div>");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlHead(accum, 0, outputSettings);
        Assert.assertEquals("&lt;div&gt;Testing&lt;/div&gt;", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Document.OutputSettings outputSettings = new Document("").outputSettings();
        TextNode node = new TextNode("<div>Testing</div>");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlTail(accum, 0, outputSettings);
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test Node");
        TextNode cloneNode = node.clone();
        Assert.assertEquals(node.text(), cloneNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("Test &amp; Node", false);
        Assert.assertEquals("Test & Node", node.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String normalisedText = TextNode.normaliseWhitespace("  Normalise  this   white   space!  ");
        Assert.assertEquals("Normalise this white space!", normalisedText);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String strippedText = TextNode.stripLeadingWhitespace("  Remove this!  ");
        Assert.assertEquals("Remove this!  ", strippedText);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Has trailing space ");
        boolean result = TextNode.lastCharIsWhitespace(sb);
        Assert.assertTrue(result);
    }

}