package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedClone_Test {

    @Test
    public void clone_Test() {
        TextNode textNode = new TextNode("testText");
        TextNode clonedTextNode = textNode.clone();
        Assert.assertEquals(textNode.text(), clonedTextNode.text());
    }

}