package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedTextSetTest {

    @Test
    public void textSetTest() {
        TextNode node = new TextNode("some text");
        node.text("new text");
        Assert.assertEquals("new text", node.text());
    }

}