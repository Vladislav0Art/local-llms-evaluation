package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        boolean isWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("Test Text "));
        Assert.assertTrue(isWhitespace);
        isWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("Test Text"));
        Assert.assertFalse(isWhitespace);
    }

}