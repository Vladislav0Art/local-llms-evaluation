package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.helper.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void textNodeTest() {
        final String text = "sample text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.text());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        final String text = "sample text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.text());
        Assert.assertEquals(textNode, textNode.text(text));
    }

    @Test
    public void getWholeTextTest() {
        final String text = "sample text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        Assert.assertEquals(true, textNode.isBlank());

        final String text = "sample text";
        textNode = new TextNode(text);
        Assert.assertEquals(false, textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        final String text = "sample text";
        TextNode textNode = new TextNode(text);
        TextNode tailTextNode = textNode.splitText(6);
        Assert.assertEquals("sample", textNode.text());
        Assert.assertEquals(" text", tailTextNode.text());
    }

    @Test
    public void splitTextNegativeOffsetTest() {
        final String text = "sample text";
        TextNode textNode = new TextNode(text);
        TextNode tailTextNode = textNode.splitText(-1);
    }

    @Test
    public void splitTextBiggerOffsetTest() {
        final String text = "sample text";
        TextNode textNode = new TextNode(text);
        TextNode tailTextNode = textNode.splitText(text.length() + 1);
    }

    @Test
    public void toStringTest() {
        final String text = "sample text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.toString());
    }

    @Test
    public void cloneTest() {
        final String text = "sample text";
        TextNode textNode = new TextNode(text);
        TextNode cloneTextNode = textNode.clone();
        Assert.assertEquals(cloneTextNode.text(), textNode.text());
    }

    @Test
    public void createFromEncodedTest() {
        final String input = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(input);

        final String expected = "<";
        Assert.assertEquals(expected, textNode.text());
    }

}