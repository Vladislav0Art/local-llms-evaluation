package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Parser;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String text = "test text";
        TextNode node = new TextNode(text);
        TextNode clonedNode = node.clone();
        Assert.assertEquals(node.text(), clonedNode.text());
    }

}