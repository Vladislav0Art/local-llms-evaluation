package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("text", textNode.nodeName());
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("test", textNode.text());
    }

    @Test
    public void testTextModification() {
        TextNode textNode = new TextNode("test");
        textNode.text("modified");
        Assert.assertEquals("modified", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("test");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void testIsBlankWithEmptyText() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode splitTextNode = textNode.splitText(1);
        Assert.assertEquals("t", textNode.text());
        Assert.assertEquals("est", splitTextNode.text());
    }

    @Test
    public void testToString() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("test", textNode.toString());
    }

}