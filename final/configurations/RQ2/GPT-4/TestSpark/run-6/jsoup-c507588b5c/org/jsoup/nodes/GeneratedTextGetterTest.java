package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedTextGetterTest {

    @Test
    public void textGetterTest() {
        TextNode node = new TextNode("Test text");
        Assert.assertEquals("Test text", node.text());
    }

}