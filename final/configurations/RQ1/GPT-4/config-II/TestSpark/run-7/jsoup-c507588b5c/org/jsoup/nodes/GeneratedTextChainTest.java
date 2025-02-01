package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextChainTest {

    @Test
    public void textChainTest() {
        TextNode node = new TextNode(" Test ");
        node = node.text("Another test");
        Assert.assertEquals("Another test", node.text());
    }

}