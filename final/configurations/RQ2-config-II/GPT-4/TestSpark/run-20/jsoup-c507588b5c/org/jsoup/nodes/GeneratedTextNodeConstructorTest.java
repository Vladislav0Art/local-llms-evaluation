package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void textNodeConstructorTest() {
        String testText = "Test Text";
        TextNode textNode = new TextNode(testText);
        Assert.assertEquals(testText, textNode.text());
    }

}