package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedLastCharIsWhitespaceTestNotWhitespace {

    private static final Document.OutputSettings outputSettings = new Document.OutputSettings();

    @Test
    public void lastCharIsWhitespaceTestNotWhitespace() {
        StringBuilder textWithoutWhitespace = new StringBuilder("example text");
        boolean isWhitespace = TextNode.lastCharIsWhitespace(textWithoutWhitespace);
        Assert.assertFalse(isWhitespace);
    }

}