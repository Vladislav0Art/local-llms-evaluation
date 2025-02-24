package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextWithNewTextTest {

    @Test
    public void textWithNewTextTest() {
        TextNode textNode = new TextNode("Some text");
        TextNode newTextNode = textNode.text("New text");

        Assert.assertEquals("New text", newTextNode.text());
    }

}