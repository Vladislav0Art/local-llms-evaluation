package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode(" test test ");
        Assert.assertEquals(" test test ", textNode.getWholeText());
    }

}