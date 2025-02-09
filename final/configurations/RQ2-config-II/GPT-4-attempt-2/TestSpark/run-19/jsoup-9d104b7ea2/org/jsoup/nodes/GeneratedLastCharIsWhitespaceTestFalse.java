package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTestFalse {

    @Test
    public void lastCharIsWhitespaceTestFalse() {
        StringBuilder sb = new StringBuilder("lastCharIsWhitespace");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}