package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        TextNode node = new TextNode("test");
        Assert.assertNotNull(node);
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("test");
        Assert.assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode("test");
        Assert.assertEquals("test", node.text());
    }

    @Test
    public void setTextTest() {
        TextNode node = new TextNode("test");
        node.text("new text");
        Assert.assertEquals("new text", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("test");
        Assert.assertEquals("test", node.getWholeText());
    }

    @Test
    public void isBlankTest_whenTextIsBlank() {
        TextNode node = new TextNode("");
        Assert.assertTrue(node.isBlank());
    }

    @Test
    public void isBlankTest_whenTextIsNotBlank() {
        TextNode node = new TextNode("test");
        Assert.assertFalse(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("test");
        TextNode split = node.splitText(2);
        Assert.assertEquals("te", node.getWholeText());
        Assert.assertEquals("st", split.getWholeText());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("test");
        TextNode clone = node.clone();
        Assert.assertEquals(node.getWholeText(), clone.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("test");
        Assert.assertNotNull(node);
    }

    @Test
    public void normaliseWhitespaceTest() {
        String normalized = TextNode.normaliseWhitespace("test   test");
        Assert.assertEquals("test test", normalized);
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String stripped = TextNode.stripLeadingWhitespace("   test");
        Assert.assertEquals("test", stripped);
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("test ");
        boolean isLastSpace = TextNode.lastCharIsWhitespace(sb);
        Assert.assertTrue(isLastSpace);
    }

}