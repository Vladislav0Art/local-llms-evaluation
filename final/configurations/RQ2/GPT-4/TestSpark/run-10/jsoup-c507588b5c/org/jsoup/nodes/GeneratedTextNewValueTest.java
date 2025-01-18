package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GeneratedTextNewValueTest {

    @Test
    public void textNewValueTest() {
        TextNode textNode = new TextNode("Hello");
        textNode.text("Hi");
        Assert.assertEquals("Hi", textNode.text());
    }

}