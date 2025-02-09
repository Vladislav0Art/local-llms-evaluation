package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String text = "sample text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.text());
    }

}