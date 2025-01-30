package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        String text = "    ";
        TextNode node = new TextNode(text);
        Assert.assertTrue(node.isBlank());
    }

}