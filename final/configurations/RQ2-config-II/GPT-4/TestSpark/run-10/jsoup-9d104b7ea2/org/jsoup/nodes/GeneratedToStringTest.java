package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("sample text");
        String output = textNode.toString();
        Assert.assertTrue(output.startsWith("TextNode"));
        Assert.assertTrue(output.contains("sample text"));
    }

}