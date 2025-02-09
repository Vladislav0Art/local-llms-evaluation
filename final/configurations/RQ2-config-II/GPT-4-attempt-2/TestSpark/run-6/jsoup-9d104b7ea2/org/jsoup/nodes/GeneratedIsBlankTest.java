package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        String text = "sample text";
        TextNode textNode = new TextNode(text);
        Assert.assertFalse(textNode.isBlank());
    }

}