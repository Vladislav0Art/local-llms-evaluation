package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;

public class GeneratedTestTrimmingWhitespace {

    @Test
    public void testTrimmingWhitespace() {
        TextNode node = new TextNode("   Hello  World! ");
        String text = node.text();
        Assert.assertEquals("Hello World", text);
    }

}