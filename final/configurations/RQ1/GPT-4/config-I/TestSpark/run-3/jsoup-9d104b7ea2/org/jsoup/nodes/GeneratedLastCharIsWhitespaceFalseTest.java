package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceFalseTest {

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        StringBuilder sb = new StringBuilder("No whitespace at end");
        Assert.assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}