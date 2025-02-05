package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String text = "ToString Text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.toString());
    }

}