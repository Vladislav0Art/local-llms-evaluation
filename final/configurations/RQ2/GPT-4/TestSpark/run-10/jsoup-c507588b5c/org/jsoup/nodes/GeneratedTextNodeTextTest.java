package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GeneratedTextNodeTextTest {

    @Test
    public void textNodeTextTest() {
        TextNode textNode = new TextNode("Hello");
        Assert.assertEquals("Hello", textNode.text());
    }

}