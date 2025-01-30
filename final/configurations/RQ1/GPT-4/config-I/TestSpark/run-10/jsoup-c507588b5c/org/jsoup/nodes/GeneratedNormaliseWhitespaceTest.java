package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = "   This   is   a   sentence.  ";
        String result = TextNode.normaliseWhitespace(text);

        Assert.assertEquals("This is a sentence.", result);
    }

}