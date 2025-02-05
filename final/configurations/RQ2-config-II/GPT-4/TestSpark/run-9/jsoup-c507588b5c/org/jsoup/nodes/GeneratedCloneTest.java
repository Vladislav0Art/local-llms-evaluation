package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("clone me");
        TextNode cloneNode = node.clone();
        Assert.assertEquals(node.getWholeText(), cloneNode.getWholeText());
    }

}