package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String text = "Clone Text";
        TextNode textNode = new TextNode(text);
        TextNode clone = textNode.clone();
        Assert.assertEquals(textNode.text(), clone.text());
        Assert.assertNotSame(textNode, clone);
    }

}