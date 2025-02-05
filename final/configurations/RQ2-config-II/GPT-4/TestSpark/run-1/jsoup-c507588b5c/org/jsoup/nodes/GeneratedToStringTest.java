package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String text = "ToString Test";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.toString());
    }

}