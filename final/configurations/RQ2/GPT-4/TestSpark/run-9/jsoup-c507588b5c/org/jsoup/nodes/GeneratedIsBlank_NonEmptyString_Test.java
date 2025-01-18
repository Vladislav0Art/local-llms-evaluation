package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedIsBlank_NonEmptyString_Test {

    @Test
    public void isBlank_NonEmptyString_Test() {
        TextNode textNode = new TextNode("testText");
        Assert.assertFalse(textNode.isBlank());
    }

}