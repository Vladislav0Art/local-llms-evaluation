package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutlineTag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String normalisedWhiteSpace = TextNode.normaliseWhitespace("Test     Case");
        Assert.assertEquals("Test Case", normalisedWhiteSpace);
    }

}