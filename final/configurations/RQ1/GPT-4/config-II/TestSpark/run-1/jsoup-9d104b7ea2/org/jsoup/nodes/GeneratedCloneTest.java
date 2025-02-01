package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String text = "Test Text";
        TextNode node = new TextNode(text);
        TextNode cloneNode = node.clone();
        Assert.assertNotSame(node, cloneNode);
        Assert.assertEquals(node.getWholeText(), cloneNode.getWholeText());
    }

}