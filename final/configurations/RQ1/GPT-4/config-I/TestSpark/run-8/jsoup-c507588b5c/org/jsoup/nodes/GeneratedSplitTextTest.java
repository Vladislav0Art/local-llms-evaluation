package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("some text");
        TextNode tail = node.splitText(5);
        Assert.assertEquals("some ", node.getWholeText());
        Assert.assertEquals("text", tail.getWholeText());
    }

}