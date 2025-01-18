package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Sample Text Node");
        TextNode splitNode = node.splitText(6);
        Assert.assertEquals("Sample ", node.text());
        Assert.assertEquals("Text Node", splitNode.text());
    }

}