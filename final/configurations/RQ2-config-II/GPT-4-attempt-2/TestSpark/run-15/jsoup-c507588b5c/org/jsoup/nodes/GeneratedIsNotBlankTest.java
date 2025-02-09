package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsNotBlankTest {

    @Test
    public void isNotBlankTest() {
        TextNode textNode = new TextNode("Not Blank");
        Assert.assertFalse(textNode.isBlank());
    }

}