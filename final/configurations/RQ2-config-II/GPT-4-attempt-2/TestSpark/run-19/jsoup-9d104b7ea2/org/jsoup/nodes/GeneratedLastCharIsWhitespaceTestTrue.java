package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTestTrue {

    @Test
    public void lastCharIsWhitespaceTestTrue() {
        StringBuilder sb = new StringBuilder("lastCharIsWhitespace ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}