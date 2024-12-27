package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Clone");
        TextNode cloneNode = node.clone();
        Assert.assertNotSame(node, cloneNode);
        Assert.assertEquals(node.text(), cloneNode.text());
    }

}