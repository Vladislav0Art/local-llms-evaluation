package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testConstructor() {
        TextNode textNode = new TextNode("text");
        Assert.assertEquals("text", textNode.coreValue());
    }

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("text");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("text");
        Assert.assertEquals("text", textNode.text());
    }

    @Test
    public void testTextSetter() {
        TextNode textNode = new TextNode("text");
        textNode.text("new text");
        Assert.assertEquals("new text", textNode.coreValue());
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("text");
        Assert.assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());
        textNode = new TextNode("text");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("text");
        TextNode splitTextNode = textNode.splitText(2);
        Assert.assertEquals("te", textNode.coreValue());
        Assert.assertEquals("xt", splitTextNode.coreValue());
    }

}