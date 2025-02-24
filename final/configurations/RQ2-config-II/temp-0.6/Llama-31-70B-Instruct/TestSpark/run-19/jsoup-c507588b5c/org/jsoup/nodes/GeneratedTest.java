package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("hello");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("hello");
        Assert.assertEquals("hello", textNode.text());
    }

    @Test
    public void textSetTest() {
        TextNode textNode = new TextNode("hello");
        textNode.text("world");
        Assert.assertEquals("world", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("hello");
        Assert.assertEquals("hello", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("hello");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("hello");
        TextNode splitTextNode = textNode.splitText(2);
        Assert.assertEquals("llo", splitTextNode.text());
    }

}