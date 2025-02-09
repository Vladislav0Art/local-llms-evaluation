package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String normalisedText = TextNode.normaliseWhitespace("  Normalise  this   white   space!  ");
        Assert.assertEquals("Normalise this white space!", normalisedText);
    }

}