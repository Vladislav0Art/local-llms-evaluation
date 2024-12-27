package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("Hello ");
        boolean isLastCharWhitespace = TextNode.lastCharIsWhitespace(sb);
        Assert.assertTrue(isLastCharWhitespace);
    }

}