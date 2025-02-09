package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextSetterTest {

    // Tests for TextNode(String text)

    @Test
    public void textSetterTest() {
        TextNode node = new TextNode("Old text.");
        node.text("New text.");
        Assert.assertEquals("New text.", node.text());
    }

}