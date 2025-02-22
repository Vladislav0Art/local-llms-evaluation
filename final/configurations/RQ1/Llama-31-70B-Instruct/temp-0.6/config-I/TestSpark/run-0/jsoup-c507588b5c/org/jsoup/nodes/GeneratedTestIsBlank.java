package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import org.junit.Assert;

public class GeneratedTestIsBlank {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Testing");
    }

    @Test
    public void testIsBlank() {
        Assert.assertFalse(textNode.isBlank());
        textNode.text("   ");
        Assert.assertTrue(textNode.isBlank());
    }

}