package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Some text");
        String nodeName = textNode.nodeName();

        Assert.assertEquals("#text", nodeName);
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Some text");
        String text = textNode.text();

        Assert.assertEquals("Some text", text);
    }

    @Test
    public void textWithNewTextTest() {
        TextNode textNode = new TextNode("Some text");
        TextNode newTextNode = textNode.text("New text");

        Assert.assertEquals("New text", newTextNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("Some text");
        String wholeText = textNode.getWholeText();

        Assert.assertEquals("Some text", wholeText);
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode(" ");
        boolean isBlank = textNode.isBlank();

        Assert.assertTrue(isBlank);
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Some text");
        TextNode splitTextNode = textNode.splitText(2);

        Assert.assertEquals("me text", splitTextNode.text());
    }

}