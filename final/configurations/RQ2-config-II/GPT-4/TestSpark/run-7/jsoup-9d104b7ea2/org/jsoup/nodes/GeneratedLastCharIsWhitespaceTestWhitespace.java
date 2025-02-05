package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceTestWhitespace {

    private static final Document.OutputSettings outputSettings = new Document.OutputSettings();

    @Test
    public void lastCharIsWhitespaceTestWhitespace() {
        StringBuilder textWithWhitespace = new StringBuilder("example text ");
        boolean isWhitespace = TextNode.lastCharIsWhitespace(textWithWhitespace);
        Assert.assertTrue(isWhitespace);
    }

}