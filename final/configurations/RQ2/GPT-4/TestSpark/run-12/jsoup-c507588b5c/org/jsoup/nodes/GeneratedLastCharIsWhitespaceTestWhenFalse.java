package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceTestWhenFalse {

    @Test
    public void lastCharIsWhitespaceTestWhenFalse() {
        StringBuilder sb = new StringBuilder("Test");
        Assert.assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}