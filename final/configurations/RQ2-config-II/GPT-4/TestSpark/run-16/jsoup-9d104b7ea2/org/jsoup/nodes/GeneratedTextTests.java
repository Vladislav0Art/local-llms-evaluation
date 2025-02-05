package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextTests {

    @Test
    public void textTests() {
        TextNode node = new TextNode("test");
        node.text("newTest");
        Assert.assertEquals("newTest", node.text());
    }

}