package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedIsBlank_EmptyString_Test {

    @Test
    public void isBlank_EmptyString_Test() {
        TextNode textNode = new TextNode("");
        Assert.assertTrue(textNode.isBlank());
    }

}