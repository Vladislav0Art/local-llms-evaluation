package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        String text = "Test text";
        TextNode textNode = new TextNode(text);

        Assert.assertEquals("#text", textNode.nodeName());
    }

}