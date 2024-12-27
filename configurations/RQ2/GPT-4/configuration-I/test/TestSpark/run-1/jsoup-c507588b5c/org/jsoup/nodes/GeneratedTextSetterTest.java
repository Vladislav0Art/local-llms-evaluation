package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode node = new TextNode("Hello");
        node.text("World");
        Assert.assertEquals("World", node.text());
    }

}