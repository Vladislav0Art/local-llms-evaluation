package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceTestWhenTrue {

    @Test
    public void lastCharIsWhitespaceTestWhenTrue() {
        StringBuilder sb = new StringBuilder("Test ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}