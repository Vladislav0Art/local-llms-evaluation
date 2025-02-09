package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = "      sample        text      ";
        String result = TextNode.normaliseWhitespace(text);
        Assert.assertEquals(" sample text ", result);
    }

}