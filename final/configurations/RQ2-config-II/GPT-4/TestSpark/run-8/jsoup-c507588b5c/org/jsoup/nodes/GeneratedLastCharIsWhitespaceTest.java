package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder stringBuilder = new StringBuilder("Sample Text ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(stringBuilder));
    }

}