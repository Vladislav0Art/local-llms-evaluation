package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String normalisedText = TextNode.normaliseWhitespace(" Normalise  Whitespace ");
        Assert.assertEquals("Normalise Whitespace", normalisedText);
    }

}