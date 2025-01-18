package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String text = "Test text";
        TextNode textNode = new TextNode(text);
        TextNode clonedNode = textNode.clone();

        Assert.assertNotSame(textNode, clonedNode);
        Assert.assertEquals(textNode.getWholeText(), clonedNode.getWholeText());
    }

}