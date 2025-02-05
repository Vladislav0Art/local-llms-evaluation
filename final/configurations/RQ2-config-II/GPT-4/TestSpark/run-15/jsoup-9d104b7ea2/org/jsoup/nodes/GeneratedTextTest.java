package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String text = "Some text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.text());
    }

}