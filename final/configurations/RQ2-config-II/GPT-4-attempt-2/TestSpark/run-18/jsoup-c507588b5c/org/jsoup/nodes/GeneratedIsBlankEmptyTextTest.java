package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankEmptyTextTest {

    @Test
    public void isBlankEmptyTextTest() {
        String text = "";
        TextNode node = new TextNode(text);
        Assert.assertTrue("Node should be empty", node.isBlank());
    }

}