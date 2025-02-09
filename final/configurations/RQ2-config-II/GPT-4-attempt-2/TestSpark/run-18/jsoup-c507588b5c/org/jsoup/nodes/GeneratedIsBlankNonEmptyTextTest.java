package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankNonEmptyTextTest {

    @Test
    public void isBlankNonEmptyTextTest() {
        String text = "hello";
        TextNode node = new TextNode(text);
        Assert.assertFalse("Node should not be empty", node.isBlank());
    }

}