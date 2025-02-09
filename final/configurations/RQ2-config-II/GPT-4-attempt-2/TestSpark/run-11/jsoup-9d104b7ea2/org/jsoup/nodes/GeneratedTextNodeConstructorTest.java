package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextNodeConstructorTest {

    // Tests for TextNode(String text)

    @Test
    public void TextNodeConstructorTest() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        Assert.assertEquals(text, node.text());
    }

}