package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceTextTest {

    @Test
    public void normaliseWhitespaceTextTest() {
        String normalizedText = TextNode.normaliseWhitespace(" Test ");
        Assert.assertEquals(" Test", normalizedText);
    }

}