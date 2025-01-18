package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNormaliseWhitespace_Basic_Test {

    @Test
    public void normaliseWhitespace_Basic_Test() {
        String normalisedString = TextNode.normaliseWhitespace("   This is a    test       ");
        Assert.assertEquals("This is a test", normalisedString);
    }

}