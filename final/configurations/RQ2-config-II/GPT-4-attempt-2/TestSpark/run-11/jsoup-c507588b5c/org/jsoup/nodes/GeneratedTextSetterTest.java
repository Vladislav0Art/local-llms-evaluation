package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("Hello");
        TextNode updatedNode = textNode.text("World");
        Assert.assertEquals("World", updatedNode.text());
    }

}