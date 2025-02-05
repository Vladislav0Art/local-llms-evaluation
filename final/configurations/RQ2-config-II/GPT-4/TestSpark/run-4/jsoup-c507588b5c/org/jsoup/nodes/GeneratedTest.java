package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("Test TextNode");
        Assert.assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        final String testText = "Test TextNode";
        TextNode node = new TextNode(testText);
        Assert.assertEquals(testText, node.text());
    }

    @Test
    public void textSetTest() {
        final String testText = "Test TextNode";
        TextNode node = new TextNode("");
        node.text(testText);
        Assert.assertEquals(testText, node.text());
    }

    @Test
    public void getWholeTextTest() {
        final String testText = "Test TextNode";
        TextNode node = new TextNode(testText);
        Assert.assertEquals(testText, node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("");
        Assert.assertTrue(node.isBlank());
        TextNode node2 = new TextNode("Test");
        Assert.assertFalse(node2.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Test TextNode");
        Assert.assertEquals("Test", node.splitText(4).getWholeText());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Document.OutputSettings settings = new Document.OutputSettings();
        TextNode node = new TextNode("Test TextNode");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlHead(accum, 0, settings);
        Assert.assertEquals("Test TextNode", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Document.OutputSettings settings = new Document.OutputSettings();
        TextNode node = new TextNode("Test TextNode");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlTail(accum, 0, settings);
        Assert.assertEquals("", accum.toString()); // Tail should not append anything
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test TextNode");
        TextNode cloned = node.clone();
        Assert.assertEquals(node.getWholeText(), cloned.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        String htmlEncoded = "Test&nbsp;TextNode";
        TextNode node = TextNode.createFromEncoded(htmlEncoded, false);
        Assert.assertEquals("Test TextNode", node.text());
    }

}