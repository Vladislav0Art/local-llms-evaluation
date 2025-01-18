package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNodeNameTest {

    // Test for constructor

    @Test
    public void nodeNameTest() {
        TextNode tn = new TextNode("test text");
        Assert.assertTrue(tn.nodeName().equals("#text"));
    }

}