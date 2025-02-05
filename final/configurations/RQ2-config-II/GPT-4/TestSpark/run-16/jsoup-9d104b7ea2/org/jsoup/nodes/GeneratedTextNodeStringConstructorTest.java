package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextNodeStringConstructorTest {

    @Test
    public void textNodeStringConstructorTest() {
        TextNode node = new TextNode("test");
        Assert.assertEquals("test", node.text());
    }

}