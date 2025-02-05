package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        Assert.assertFalse(node.isBlank());
    }

}