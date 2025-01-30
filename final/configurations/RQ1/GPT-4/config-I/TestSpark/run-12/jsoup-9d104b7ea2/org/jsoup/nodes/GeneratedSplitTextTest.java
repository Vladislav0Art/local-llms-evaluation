package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("hello world");
        TextNode splitNode = tn.splitText(5);
        Assert.assertEquals("hello", tn.text());
        Assert.assertEquals(" world", splitNode.text());
    }

}