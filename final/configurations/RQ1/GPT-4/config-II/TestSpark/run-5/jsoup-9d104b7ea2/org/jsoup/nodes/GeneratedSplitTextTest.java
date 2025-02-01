package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "This is to be splitted";
        TextNode node = new TextNode(text);

        TextNode splitted = node.splitText(7);

        Assert.assertEquals("This is", node.text());
        Assert.assertEquals(" to be splitted", splitted.text());
    }

}