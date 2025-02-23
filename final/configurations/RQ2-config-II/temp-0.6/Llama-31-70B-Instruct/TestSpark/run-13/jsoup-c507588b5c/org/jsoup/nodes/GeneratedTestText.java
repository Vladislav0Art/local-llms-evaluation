package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode textNode = new TextNode("text");
        Assert.assertEquals("text", textNode.text());
    }

}