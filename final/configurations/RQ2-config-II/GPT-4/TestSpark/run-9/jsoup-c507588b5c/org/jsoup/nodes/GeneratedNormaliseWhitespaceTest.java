package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String nonNormalizedText = "normalise   this";
        String normalizedText = TextNode.normaliseWhitespace(nonNormalizedText);
        Assert.assertEquals("normalise this", normalizedText);
    }

}