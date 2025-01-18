package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Parser;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String normalized = TextNode.normaliseWhitespace("   test   text   ");
        Assert.assertEquals(" test text ", normalized);
    }

}