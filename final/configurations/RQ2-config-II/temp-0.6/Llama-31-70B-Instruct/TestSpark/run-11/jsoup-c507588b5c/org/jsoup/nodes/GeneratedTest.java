package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        TextNode node = new TextNode("test");
        Assert.assertEquals("test", node.text());
    }

    @Test
    public void constructorExceptionTest() {
        new TextNode(null);
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
    public void textSetterTest() {
        TextNode node = new TextNode("test");
        node.text("new text");
        Assert.assertEquals("new text", node.text());
    }

    @Test
    public void textSetterExceptionTest() {
        TextNode node = new TextNode("test");
        node.text(null);
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("test");
        Assert.assertEquals("test", node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("test");
        Assert.assertFalse(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("hello world");
        TextNode newNode = node.splitText(5);
        Assert.assertEquals("world", newNode.text());
    }

}