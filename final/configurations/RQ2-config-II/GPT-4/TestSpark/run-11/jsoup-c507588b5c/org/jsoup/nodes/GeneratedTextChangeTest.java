package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GeneratedTextChangeTest {

    @Test
    public void textChangeTest() {
        TextNode textNode = new TextNode("Hello, world!");
        textNode.text("New text");
        Assert.assertEquals("New text", textNode.text());
    }

}