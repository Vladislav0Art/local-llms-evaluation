package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestConstructor {

    @Test
    public void testConstructor() {
        TextNode textNode = new TextNode("text");
        Assert.assertEquals("text", textNode.coreValue());
    }

}