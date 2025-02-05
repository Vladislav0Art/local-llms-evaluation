package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String spacedText = "test   text";
        String normalisedText = "test text";
        Assert.assertEquals(normalisedText, TextNode.normaliseWhitespace(spacedText));
    }

}