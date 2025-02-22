package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import org.junit.Assert;

public class GeneratedTestSplitText {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Testing");
    }

    @Test
    public void testSplitText() {
        TextNode splitNode = textNode.splitText(2);
        Assert.assertEquals("Te", textNode.text());
        Assert.assertEquals("sting", splitNode.text());
    }

}