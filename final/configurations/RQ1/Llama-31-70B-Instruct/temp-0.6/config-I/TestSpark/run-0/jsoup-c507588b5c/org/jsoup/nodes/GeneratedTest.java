package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import org.junit.Assert;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Testing");
    }

    @Test
    public void testConstructor() {
        Assert.assertEquals("Testing", textNode.text());
    }

    @Test
    public void testNodeName() {
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        Assert.assertEquals("Testing", textNode.text());
        textNode.text("Changed");
        Assert.assertEquals("Changed", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        Assert.assertEquals("Testing", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        Assert.assertFalse(textNode.isBlank());
        textNode.text("   ");
        Assert.assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode splitNode = textNode.splitText(2);
        Assert.assertEquals("Te", textNode.text());
        Assert.assertEquals("sting", splitNode.text());
    }

}