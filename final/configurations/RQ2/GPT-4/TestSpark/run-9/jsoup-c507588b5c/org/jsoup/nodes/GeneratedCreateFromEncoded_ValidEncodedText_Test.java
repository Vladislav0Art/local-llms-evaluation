package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCreateFromEncoded_ValidEncodedText_Test {

    @Test
    public void createFromEncoded_ValidEncodedText_Test() {
        TextNode textNode = TextNode.createFromEncoded("testText");
        Assert.assertEquals("testText", textNode.text());
    }

}