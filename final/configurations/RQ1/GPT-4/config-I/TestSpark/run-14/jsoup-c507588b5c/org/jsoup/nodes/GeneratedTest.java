package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void TextNodeCreationTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertNotNull(textNode);
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test Node");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textRetrievalTest() {
        TextNode textNode = new TextNode("   Test Node    ");
        Assert.assertEquals("Test Node", textNode.text());
    }

    @Test
    public void textSettingTest() {
        TextNode textNode = new TextNode("Test Node");
        textNode.text("Another Test");
        Assert.assertEquals("Another Test", textNode.getWholeText());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("   Test Node    ");
        Assert.assertEquals("   Test Node    ", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode emptyNode = new TextNode("");
        TextNode spaceNode = new TextNode("     ");
        TextNode textNode = new TextNode("Test Node");
        Assert.assertTrue(emptyNode.isBlank());
        Assert.assertTrue(spaceNode.isBlank());
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test Node");
        TextNode newNode = textNode.splitText(4);
        Assert.assertEquals("Test", textNode.getWholeText());
        Assert.assertEquals(" Node", newNode.getWholeText());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode textNode = new TextNode("Test Node");
        textNode.splitText(-1);
    }

    @Test
    public void splitTextExceedOffsetTest() {
        TextNode textNode = new TextNode("Test Node");
        textNode.splitText(10);
    }

    @Test
    public void cloneNodeTest() {
        TextNode textNode = new TextNode("Test Node");
        TextNode clonedNode = textNode.clone();
        Assert.assertNotSame(textNode, clonedNode);
        Assert.assertEquals(textNode.getWholeText(), clonedNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;Test Node&gt;");
        Assert.assertEquals("<Test Node>", textNode.getWholeText());
    }

}