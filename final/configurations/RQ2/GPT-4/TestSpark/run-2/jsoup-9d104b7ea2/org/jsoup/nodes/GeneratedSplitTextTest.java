package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitTextTest {

    // Test for constructor

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("test text");
        TextNode tn2 = tn.splitText(4);
        Assert.assertEquals("test", tn.text());
        Assert.assertEquals(" text", tn2.text());
    }

}