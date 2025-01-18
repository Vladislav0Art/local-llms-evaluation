package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextWithParamTest {

    @Test
    public void textWithParamTest() {
        TextNode node = new TextNode("Test");
        Assert.assertEquals("New Text", node.text("New Text").text());
    }

}