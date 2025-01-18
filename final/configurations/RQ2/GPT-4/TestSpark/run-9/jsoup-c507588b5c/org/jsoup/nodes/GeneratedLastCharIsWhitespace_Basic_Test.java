package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedLastCharIsWhitespace_Basic_Test {

    @Test
    public void lastCharIsWhitespace_Basic_Test() {
        boolean lastCharIsWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("This is a test "));
        Assert.assertTrue(lastCharIsWhitespace);
    }

}