package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        TextNode node = new TextNode("Initial Text");
        node.text("Updated Text");
        Assert.assertEquals("Updated Text", node.text());
    }

}