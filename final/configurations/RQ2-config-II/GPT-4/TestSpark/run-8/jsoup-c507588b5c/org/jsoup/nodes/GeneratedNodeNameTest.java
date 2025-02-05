package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Sample text");
        Assert.assertEquals("#text", textNode.nodeName());
    }

}