package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String text = " This is a test ";
        TextNode node = new TextNode(text);
        Assert.assertEquals("This is a test", node.text());
        Assert.assertEquals(text, node.getWholeText());
    }

}