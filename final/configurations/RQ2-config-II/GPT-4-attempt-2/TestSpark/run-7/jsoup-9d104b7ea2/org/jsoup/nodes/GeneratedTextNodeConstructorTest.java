package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void TextNodeConstructorTest() {
        TextNode textNode = new TextNode("test");
        Assert.assertNotNull(textNode);
        Assert.assertEquals("test", textNode.text());
    }

}