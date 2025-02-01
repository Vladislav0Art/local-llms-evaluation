package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsNotBlankTest {

    @Test
    public void isNotBlankTest() {
        TextNode node = new TextNode("Test Text");
        Assert.assertFalse(node.isBlank());
    }

}