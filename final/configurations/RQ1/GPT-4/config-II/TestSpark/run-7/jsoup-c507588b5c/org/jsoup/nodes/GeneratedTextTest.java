package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode node = new TextNode(" Test ");
        Assert.assertEquals("Test", node.text());
    }

}