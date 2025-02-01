package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Hello World");
        Assert.assertEquals("#text", textNode.nodeName());
    }

}