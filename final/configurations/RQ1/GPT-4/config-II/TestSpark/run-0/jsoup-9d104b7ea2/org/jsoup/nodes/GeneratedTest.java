package org.jsoup.nodes;

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
        TextNode textNode = new TextNode("Test case");
        Assert.assertEquals("Test case", textNode.text());
    }

    @Test
    public void textChainingTest() {
        TextNode textNode = new TextNode("Java");
        TextNode changedNode = textNode.text("Python");
        Assert.assertEquals(changedNode, textNode);
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Test case");
        Assert.assertEquals("Test case", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void notBlankTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test case");
        TextNode splitNode = textNode.splitText(4);
        Assert.assertEquals("Test", textNode.getWholeText());
        Assert.assertEquals(" case", splitNode.getWholeText());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode textNode = new TextNode("Test case");
        textNode.splitText(-1);
    }

    @Test
    public void splitTextOutOfBoundsTest() {
        TextNode textNode = new TextNode("Test case");
        textNode.splitText(50);
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Test&lt;case&gt;");
        Assert.assertEquals("Test<case>", textNode.getWholeText());
    }

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Test case");
        Assert.assertEquals("Test case", textNode.toString());
    }

}