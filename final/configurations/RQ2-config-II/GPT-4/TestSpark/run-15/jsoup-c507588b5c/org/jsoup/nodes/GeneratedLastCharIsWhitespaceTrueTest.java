package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;
import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTrueTest {

    @Test
    public void lastCharIsWhitespaceTrueTest() {
        StringBuilder sb = new StringBuilder("Test ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}