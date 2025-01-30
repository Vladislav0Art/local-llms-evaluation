package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextNodeCreationTest {

    @Test
    public void TextNodeCreationTest() {
        TextNode textNode = new TextNode("Test");
        Assert.assertNotNull(textNode);
    }

}