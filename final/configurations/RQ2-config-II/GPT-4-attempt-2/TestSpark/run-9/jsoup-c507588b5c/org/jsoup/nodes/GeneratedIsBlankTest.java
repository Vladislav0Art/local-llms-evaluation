package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode emptyTextNode = new TextNode("");
        TextNode textNode = new TextNode("Sample Text");

        Assert.assertTrue(emptyTextNode.isBlank());
        Assert.assertFalse(textNode.isBlank());
    }

}