package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;

public class GeneratedTestNoWhitespace {

    @Test
    public void testNoWhitespace() {
        TextNode node = new TextNode("This is a line of text.");
        Assert.assertFalse(node.isBlank());
    }

}