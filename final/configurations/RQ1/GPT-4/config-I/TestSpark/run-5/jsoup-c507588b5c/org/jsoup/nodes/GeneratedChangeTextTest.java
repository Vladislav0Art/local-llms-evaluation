package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedChangeTextTest {

    @Test
    public void changeTextTest() {
        String text = "test";
        TextNode node = new TextNode("");
        node.text(text);
        Assert.assertEquals(text, node.text());
    }

}