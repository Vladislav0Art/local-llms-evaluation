package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("Old Text");
        TextNode newText = textNode.text("New Text");
        Assert.assertEquals("New Text", newText.text());
    }

}