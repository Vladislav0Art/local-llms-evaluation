package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void textNodeConstructorTest() {
        String text = "sample text";
        TextNode textNode = new TextNode(text);
        Assert.assertNotNull(textNode);
    }

}