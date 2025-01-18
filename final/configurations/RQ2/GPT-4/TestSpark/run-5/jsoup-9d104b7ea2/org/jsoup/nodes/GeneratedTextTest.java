package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Parser;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String text = "test text";
        TextNode node = new TextNode(text);
        Assert.assertEquals(text, node.text());
    }

}