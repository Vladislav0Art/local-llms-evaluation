package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.TextNode;

public class GeneratedIsBlankTrueTest {

    @Test
    public void isBlankTrueTest() {
        TextNode textNode = new TextNode(" ");
        Assert.assertTrue(textNode.isBlank());
    }

}