package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode node = new TextNode("Test text");
        node.text("Modified text");
        Assert.assertEquals("Modified text", node.text());
    }

}