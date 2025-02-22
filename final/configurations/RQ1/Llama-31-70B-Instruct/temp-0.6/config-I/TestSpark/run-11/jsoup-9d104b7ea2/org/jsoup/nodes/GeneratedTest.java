package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("");
    }

    @Test
    public void testNodeName() {
        Assert.assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        Assert.assertEquals("", textNode.text());
        textNode.text("Text");
        Assert.assertEquals("Text", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        textNode.text("Text");
        Assert.assertEquals("Text", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        Assert.assertTrue(textNode.isBlank());
        textNode.text("Text");
        Assert.assertFalse(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        textNode.text("Text");
        TextNode tailNode = textNode.splitText(0);
        Assert.assertEquals("T", textNode.getWholeText());
        Assert.assertEquals("ext", tailNode.getWholeText());
    }

    @Test
    public void testSplitTextWithNegativeOffset() {
        textNode.splitText(-1);
    }

    @Test
    public void testSplitTextWithInvalidOffset() {
        textNode.splitText(1);
    }

}