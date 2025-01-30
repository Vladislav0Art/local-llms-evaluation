package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void TextNodeConstructorTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        Assert.assertEquals(text, node.getWholeText());
    }

}