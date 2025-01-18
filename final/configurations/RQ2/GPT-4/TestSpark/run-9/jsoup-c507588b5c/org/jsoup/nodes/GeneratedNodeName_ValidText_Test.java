package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNodeName_ValidText_Test {

    @Test
    public void nodeName_ValidText_Test() {
        TextNode textNode = new TextNode("testText");
        Assert.assertEquals("#text", textNode.nodeName());
    }

}