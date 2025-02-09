package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Test Text");
        TextNode newNode = node.splitText(4);
        Assert.assertEquals("Test", node.getWholeText());
        Assert.assertEquals(" Text", newNode.getWholeText());
    }

}