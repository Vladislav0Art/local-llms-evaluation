package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String output = TextNode.normaliseWhitespace(" sample   text  ");
        Assert.assertEquals(" sample text ", output);
    }

}