package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.TextNode;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void TextNodeConstructorTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertEquals("Test", textNode.getWholeText());
    }

}