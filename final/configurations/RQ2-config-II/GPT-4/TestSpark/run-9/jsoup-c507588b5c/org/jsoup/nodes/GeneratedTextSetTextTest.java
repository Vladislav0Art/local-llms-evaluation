package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextSetTextTest {

    @Test
    public void textSetTextTest() {
        TextNode node = new TextNode("initial text");
        Assert.assertEquals("initial text", node.text());
        node.text("update text");
        Assert.assertEquals("update text", node.text());
    }

}