package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNodeEmpty = new TextNode("");
        TextNode textNodeNotEmpty = new TextNode("NotEmpty");
        Assert.assertTrue(textNodeEmpty.isBlank());
        Assert.assertFalse(textNodeNotEmpty.isBlank());
    }

}