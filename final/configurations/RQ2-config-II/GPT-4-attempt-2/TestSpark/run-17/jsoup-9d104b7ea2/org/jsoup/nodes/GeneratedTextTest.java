package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode node = new TextNode("Test Node");
        Assert.assertEquals("Test Node", node.text());
    }

}