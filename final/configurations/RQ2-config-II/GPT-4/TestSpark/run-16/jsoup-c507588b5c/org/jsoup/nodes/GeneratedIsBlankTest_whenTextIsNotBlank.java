package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest_whenTextIsNotBlank {

    @Test
    public void isBlankTest_whenTextIsNotBlank() {
        TextNode node = new TextNode("test");
        Assert.assertFalse(node.isBlank());
    }

}