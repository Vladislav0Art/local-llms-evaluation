package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("   \n   ");
        Assert.assertTrue(node.isBlank());

        node = new TextNode("Something here");
        Assert.assertFalse(node.isBlank());
    }

}