package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

import static org.mockito.ArgumentMatchers.anyString;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("test");
        Assert.assertEquals("test", textNode.text());
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
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode splitTextNode = textNode.splitText(2);
        Assert.assertEquals("te", textNode.text());
        Assert.assertEquals("st", splitTextNode.text());
    }

    @Test
    public void testSplitTextWithNegativeOffset() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(-1);
    }

    @Test
    public void testSplitTextWithOffsetGreaterThanTextLength() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(5);
    }

}