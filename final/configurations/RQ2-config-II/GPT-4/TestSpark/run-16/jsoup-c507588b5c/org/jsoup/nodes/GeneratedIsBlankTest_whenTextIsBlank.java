package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest_whenTextIsBlank {

    @Test
    public void isBlankTest_whenTextIsBlank() {
        TextNode node = new TextNode("");
        Assert.assertTrue(node.isBlank());
    }

}