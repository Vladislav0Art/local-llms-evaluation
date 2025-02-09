package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormaliseWhiteSpaceTest {

    @Test
    public void normaliseWhiteSpaceTest() {
        String text = " This   is a    test ";
        String normalizedText = TextNode.normaliseWhitespace(text);
        Assert.assertEquals(" This is a test ", normalizedText);
    }

}