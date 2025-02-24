package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Some text");
        String text = textNode.text();

        Assert.assertEquals("Some text", text);
    }

}