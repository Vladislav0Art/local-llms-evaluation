package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        String text = "testText";
        TextNode node = new TextNode(text);

        Assert.assertEquals(text, node.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("test");
        Assert.assertEquals("#text", node.nodeName());
    }

    @Test
    public void textSetterGetterTest() {
        String text = "newTestText";
        TextNode node = new TextNode("test");
        node.text(text);

        Assert.assertEquals(text, node.text());
    }

    @Test
    public void getWholeTextTest() {
        String text = "wholeText";
        TextNode node = new TextNode(text);
        Assert.assertEquals(text, node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("");
        Assert.assertTrue(node.isBlank());

        node.text("not blank");
        Assert.assertFalse(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        String text = "splitTest";
        TextNode node = new TextNode(text);
        TextNode splittedNode = node.splitText(4);

        Assert.assertEquals("split", node.text());
        Assert.assertEquals("Test", splittedNode.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        String text = "outerHtmlTest";
        TextNode node = new TextNode(text);
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        node.outerHtmlHead(accum, 0, out);
        Assert.assertEquals(text, accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode node = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        node.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void cloneTest() {
        TextNode originalNode = new TextNode("cloneTest");
        TextNode clonedNode = originalNode.clone();

        Assert.assertNotSame(originalNode, clonedNode);
        Assert.assertEquals(originalNode.text(), clonedNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&#x3C;";
        TextNode node = TextNode.createFromEncoded(encodedText);

        Assert.assertEquals("<", node.text());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String textWithWhitespace = "   \n   Hello, \t\t\t World   \n   ";
        String normalizedText = TextNode.normaliseWhitespace(textWithWhitespace);

        Assert.assertEquals("Hello, World", normalizedText);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String textWithLeadingWhitespace = "      stripTest";
        String strippedText = TextNode.stripLeadingWhitespace(textWithLeadingWhitespace);

        Assert.assertEquals("stripTest", strippedText);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Test ");
        boolean result = TextNode.lastCharIsWhitespace(sb);

        Assert.assertTrue(result);

        sb.append("Test");
        result = TextNode.lastCharIsWhitespace(sb);

        Assert.assertFalse(result);
    }

}