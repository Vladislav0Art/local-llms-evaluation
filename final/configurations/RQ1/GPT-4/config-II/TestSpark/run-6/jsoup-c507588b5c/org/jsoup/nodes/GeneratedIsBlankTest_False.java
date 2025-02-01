package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedIsBlankTest_False {

    @Test
    public void isBlankTest_False() {
        TextNode textNode = new TextNode("test");
        Assert.assertFalse(textNode.isBlank());
    }

}