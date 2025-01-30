package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("test");
        Assert.assertNotNull(textNode);
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode(" test ");
        Assert.assertEquals("test", textNode.text());
    }

    @Test
    public void setTextTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("New text");
        Assert.assertEquals("New text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode(" test ");
        Assert.assertEquals(" test ", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode(" ");
        Assert.assertTrue(textNode.isBlank());
        textNode = new TextNode("test");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode newNode = textNode.splitText(2);
        Assert.assertEquals("te", textNode.getWholeText());
        Assert.assertEquals("st", newNode.getWholeText());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(-1);
    }

    @Test
    public void splitTextExceedLengthOffsetTest() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(5);
    }

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("test");
        TextNode clonedNode = textNode.clone();
        Assert.assertEquals(textNode.text(), clonedNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;test&gt;");
        Assert.assertEquals("<test>", textNode.text());
    }

}