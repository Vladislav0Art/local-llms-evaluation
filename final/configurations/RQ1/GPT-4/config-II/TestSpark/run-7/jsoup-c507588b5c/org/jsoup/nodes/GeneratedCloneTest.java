package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test");
        TextNode clone = node.clone();
        Assert.assertNotSame(node, clone);
        Assert.assertEquals(node.text(), clone.text());
    }

}