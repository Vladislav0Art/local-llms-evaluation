package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedLastCharIsWhitespacePositiveTest {

    @Test
    public void lastCharIsWhitespacePositiveTest() {
        StringBuilder sb = new StringBuilder().append("Hello World ");
        Assert.assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}