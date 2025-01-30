package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceTrueTest {

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        StringBuilder sb = new StringBuilder("Whitespace at end ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}