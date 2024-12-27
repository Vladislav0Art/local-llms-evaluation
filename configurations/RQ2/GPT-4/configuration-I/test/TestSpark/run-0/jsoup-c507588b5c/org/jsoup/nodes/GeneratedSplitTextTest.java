package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;

public class GeneratedSplitTextTest {

    @Test
    public void SplitTextTest() {
        TextNode node = new TextNode("hello world");
        TextNode newNode = node.splitText(5);
        Assert.assertEquals("hello", node.text());
        Assert.assertEquals(" world", newNode.text());
    }

}