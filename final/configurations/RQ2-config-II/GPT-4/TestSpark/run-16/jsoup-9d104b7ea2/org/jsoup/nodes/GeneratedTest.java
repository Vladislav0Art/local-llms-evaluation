package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void textNodeStringConstructorTest() {
        TextNode node = new TextNode("test");
        Assert.assertEquals("test", node.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("");
        Assert.assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTests() {
        TextNode node = new TextNode("test");
        node.text("newTest");
        Assert.assertEquals("newTest", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("test");
        Assert.assertEquals("test", node.getWholeText());
    }

    @Test
    public void isBlankTrueTest() {
        TextNode node = new TextNode("");
        Assert.assertTrue(node.isBlank());
    }

    @Test
    public void isBlankFalseTest() {
        TextNode node = new TextNode("test");
        Assert.assertFalse(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("test");
        TextNode splitNode = node.splitText(2);
        Assert.assertEquals("te", node.text());
        Assert.assertEquals("st", splitNode.text());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder accum = new StringBuilder();
        TextNode node = new TextNode("test");
        node.outerHtmlHead(accum, 0, new Document.OutputSettings());
        Assert.assertEquals("test", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        StringBuilder accum = new StringBuilder();
        TextNode node = new TextNode("");
        node.outerHtmlTail(accum, 0, new Document.OutputSettings());
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        TextNode node = new TextNode("test");
        Assert.assertEquals("test", node.toString());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("test");
        TextNode cloneNode = node.clone();
        Assert.assertEquals(node.text(), cloneNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("test&amp;", false);
        Assert.assertEquals("test&", node.text());
    }

}