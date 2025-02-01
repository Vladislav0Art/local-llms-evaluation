package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedIsBlankTest_True {

    @Test
    public void isBlankTest_True() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());
    }

}