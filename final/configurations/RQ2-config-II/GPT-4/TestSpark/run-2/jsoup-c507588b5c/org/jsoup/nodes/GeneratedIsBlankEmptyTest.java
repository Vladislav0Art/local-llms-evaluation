package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankEmptyTest {

    @Test
    public void isBlankEmptyTest() {
        String text = "";
        TextNode node = new TextNode(text);
        Assert.assertTrue(node.isBlank());
    }

}