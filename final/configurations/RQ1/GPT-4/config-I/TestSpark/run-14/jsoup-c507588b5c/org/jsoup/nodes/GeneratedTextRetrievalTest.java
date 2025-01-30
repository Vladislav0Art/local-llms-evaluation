package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextRetrievalTest {

    @Test
    public void textRetrievalTest() {
        TextNode textNode = new TextNode("   Test Node    ");
        Assert.assertEquals("Test Node", textNode.text());
    }

}