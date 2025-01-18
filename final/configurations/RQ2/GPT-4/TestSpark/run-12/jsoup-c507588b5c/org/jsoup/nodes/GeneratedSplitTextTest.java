package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode tn1 = new TextNode("Hello World!");
        TextNode tn2 = tn1.splitText(5);
        Assert.assertEquals("Hello ", tn1.getWholeText());
        Assert.assertEquals("World!", tn2.getWholeText());
    }

}