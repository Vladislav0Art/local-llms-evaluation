package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        Assert.assertEquals(text, node.text());
    }

}