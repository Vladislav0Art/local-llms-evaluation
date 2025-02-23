package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());
        textNode = new TextNode("text");
        Assert.assertFalse(textNode.isBlank());
    }

}