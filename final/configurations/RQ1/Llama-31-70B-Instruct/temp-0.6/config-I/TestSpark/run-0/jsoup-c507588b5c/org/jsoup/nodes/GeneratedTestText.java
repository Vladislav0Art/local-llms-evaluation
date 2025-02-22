package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import org.junit.Assert;

public class GeneratedTestText {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Testing");
    }

    @Test
    public void testText() {
        Assert.assertEquals("Testing", textNode.text());
        textNode.text("Changed");
        Assert.assertEquals("Changed", textNode.text());
    }

}