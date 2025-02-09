package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextGetterTest {

    @Test
    public void textGetterTest() {
        TextNode textNode = new TextNode("Sample Text");
        Assert.assertEquals("Sample Text", textNode.text());
    }

}