package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "splitTest";
        TextNode node = new TextNode(text);
        TextNode splittedNode = node.splitText(4);

        Assert.assertEquals("split", node.text());
        Assert.assertEquals("Test", splittedNode.text());
    }

}